package org.example;

import antlr.mylangBaseVisitor;
import antlr.mylangParser;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyLangVisitor extends mylangBaseVisitor<String> {
    StringBuilder final_code = new StringBuilder();
    int reg_cnt = 1;
    int label_cnt = 0;
    int tmp_cnt = 1;
    int current_reg = 1;
    Map<String, Integer> var_reg = new HashMap<>();
    public String getCode(){
        return final_code.toString();
    }
    @Override
    public String visitProgram(mylangParser.ProgramContext ctx) {
        for (var stat : ctx.stmt()){
            if (current_reg > 30){
                System.out.println("Программа не поддерживается");
                System.exit(1);
            }
            visitStmt(stat);
        }
        final_code.append("ebreak\n");
        return null;
    }
    @Override
    public String visitStmt(mylangParser.StmtContext ctx) {
        if (ctx.decl_var() != null){
            visitDecl_var(ctx.decl_var());
        }
        else if (ctx.cond_if() != null){
            visitCond_if(ctx.cond_if());
        }
        else if (ctx.assign_var() != null){
            visitAssign_var(ctx.assign_var());
        }
        else if (ctx.while_loop() != null){
            visitWhile_loop(ctx.while_loop());
        }
        else if (ctx.for_loop() != null){
            visitFor_loop(ctx.for_loop());
        }
        else if (ctx.outprint() != null){
            visitOutprint(ctx.outprint());
        }
        else if (ctx.block_comment() != null){
            visitBlock_comment(ctx.block_comment());
        }
        return null;
    }
    @Override
    public String visitDecl_var(mylangParser.Decl_varContext ctx) {
        if (reg_cnt > 30){
            System.out.println("Слишком много переменных");
            System.exit(1);
        }
        if (var_reg.containsKey(ctx.VAR_NAME().getText())){
            System.out.println("Имена переменных должны быть разными");
            System.exit(1);
        }
        var_reg.put(ctx.VAR_NAME().getText(), reg_cnt);
        if (ctx.SET_TO() != null){
            String expr_res = visitExpression(ctx.expression());
            final_code.append(String.format("li x%d, %s\n", reg_cnt,
                    expr_res.trim()));
        }
        // если переменная просто объявлена, то код не генерируется
        reg_cnt += 1;
        current_reg += 1;
        return null;
    }

    @Override
    public String visitAssign_var(mylangParser.Assign_varContext ctx) {
        int reg = var_reg.get(ctx.VAR_NAME().getText());
        String expr_res = visit(ctx.expression());
        // нужный регистр, регистр с tmp
        final_code.append(String.format("addi x%d, x%s, 0\n", reg,
                expr_res.trim()));
        return null;
    }

    @Override
    public String visitCond_if(mylangParser.Cond_ifContext ctx) {
        final_code.append("#if\n");
        current_reg = reg_cnt + 1;
        String expr_res = visitExpression(ctx.expression(0));
        String if_label = "label" + label_cnt++;
        String elif_label = ctx.ALT_COND() != null ? "label" + label_cnt++ :
                null;
        String else_label = ctx.OTHERWISE() != null ? "label" + label_cnt++ :
                null;
        String end_label = "label" + label_cnt++;
        final_code.append(String.format("bne x%d, x0, %s\n", current_reg - 1,
                if_label));
        if (elif_label != null) {
            final_code.append("#elif\n");
            current_reg = reg_cnt + 1;
            visitExpression(ctx.expression(1));
            final_code.append(String.format("bne x%d, x0, %s\n", current_reg
                    - 1, elif_label));
        }
        int blocks = 0;
        if (else_label != null) {
            final_code.append("#else\n");
            current_reg = reg_cnt + 1;
            final_code.append(String.format("jal x0, %s\n", else_label));
        } else {
            final_code.append(String.format("jal x0, %s\n", end_label));
        }
        final_code.append(if_label+":\n");
        visitCode_block(ctx.code_block(blocks));
        blocks += 1;
        final_code.append(String.format("jal x0, %s\n", end_label));
        if (elif_label != null) {
            final_code.append(elif_label+":\n");
            current_reg = reg_cnt + 1;
            visitCode_block(ctx.code_block(blocks));
            blocks += 1;
            final_code.append(String.format("jal x0, %s\n", end_label));
        }
        if (else_label != null){
            final_code.append(else_label+":\n");
            current_reg = reg_cnt + 1;
            visitCode_block(ctx.code_block(blocks));
            blocks += 1;
            final_code.append(String.format("jal x0, %s\n", end_label));
        }
        final_code.append(String.format("%s:\n", end_label));
        current_reg = reg_cnt + 1;
        return null;
    }

    @Override
    public String visitWhile_loop(mylangParser.While_loopContext ctx)
    {
        String while_label = "label" + label_cnt++;
        String end_label = "label" + label_cnt++;
        final_code.append("#while\n");
        current_reg = reg_cnt + 1;
        visitExpression(ctx.expression());
        final_code.append(String.format("bne x%d, x0, %s\n", current_reg - 1,
                while_label));
        final_code.append(while_label+":\n");
        visitCode_block(ctx.code_block());
        visitExpression(ctx.expression());
        final_code.append(String.format("beq x%d, x0, %s\n", current_reg - 1,
                end_label));
        final_code.append(String.format("jal x0, %s\n", while_label));
        final_code.append(String.format("%s:\n", end_label));
        current_reg = reg_cnt + 1;
        return null;
    }

    @Override public String visitFor_loop(mylangParser.For_loopContext
                                                  ctx) {
        String for_label = "label" + label_cnt++;
        String end_label = "label" + label_cnt++;
        final_code.append("#for\n");
        visitAssign_var(ctx.assign_var(0));
        visitExpression(ctx.expression());
        final_code.append(String.format("bne x%d, x0, %s\n", current_reg - 1,
                for_label));
        final_code.append(for_label+":\n");
        visitCode_block(ctx.code_block());
        visitAssign_var(ctx.assign_var(1));
        visitExpression(ctx.expression());
        final_code.append(String.format("beq x%d, x0, %s\n", current_reg - 1,
                end_label));
        final_code.append(String.format("jal x0, %s\n", for_label));
        final_code.append(String.format("%s:\n", end_label));
        current_reg = reg_cnt + 1;
        return null;
    }

    @Override
    public String visitCode_block(mylangParser.Code_blockContext ctx) {
        if (ctx.OPEN_BLOCK() != null && ctx.CLOSE_BLOCK() != null){
            int i = 0;
            while (ctx.stmt(i) != null){
                visitStmt(ctx.stmt(i));
                i++;
            }
        }
        return null;
    }

    @Override
    public String visitOutprint(mylangParser.OutprintContext ctx)
    {
        int i = 0;
        while (ctx.outprint_arg(i) != null){
            visitOutprint_arg(ctx.outprint_arg(i));
            i ++;
        }
        return null;
    }

    @Override
    public String visitOutprint_arg(mylangParser.Outprint_argContext ctx)
    {
        if (ctx.STRING() != null) {
            String text_data = ctx.STRING().getText().substring(1,
                    ctx.STRING().getText().length() - 1);
            int[] codes = text_data.chars().toArray();
            for (int code : codes) {
                final_code.append(String.format("li x31, %d\n", code));
                final_code.append("ewrite x31\n");
            }
        } else if (ctx.DIGIT() != null) {
            String number = ctx.DIGIT().getText();
            generateNumberOutprint(number);
        } else if (ctx.VAR_NAME() != null) {
            String varName = ctx.VAR_NAME().getText();
            if (!var_reg.containsKey(varName)) {
                throw new RuntimeException("Переменная " + varName + " не объявлена.");
            }
            generateVariableOutprint(var_reg.get(varName));
        }
        return null;
    }

    private void generateNumberOutprint(String number) {
    // Преобразование числа в символы ASCII
        for (char digit : number.toCharArray()) {
            final_code.append(String.format("li x31, %d\n", (int) digit));
            final_code.append("ewrite x31\n");
        }
    }

    private void generateVariableOutprint(int reg) {
        final_code.append(String.format("addi x31, x%d, 0\n", reg)); //Копируем значение переменной в x31;
        final_code.append("li x30, 10\n"); // Делитель для получения цифр
        // Подготовка указателя стека
        final_code.append("addi x28, x0, 0\n"); // Указатель стека (регистр x28)
        // Сохранение цифр в стек
        String loopLabel = "loop" + label_cnt++;
        String popLabel = "pop" + label_cnt++;
        String endLabel = "end" + label_cnt++;
        final_code.append(String.format("%s:\n", loopLabel));
        final_code.append("rem x29, x31, x30\n"); // Получить последнюю цифру
        final_code.append("addi x29, x29, 48\n"); // Преобразовать в ASCII
        final_code.append("sw x28, 0, x29\n"); // Сохранить цифру в стек
        final_code.append("addi x28, x28, 4\n"); // Увеличить указатель стека
        final_code.append("div x31, x31, x30\n"); // Удалить последнюю цифру
        final_code.append(String.format("bne x31, x0, %s\n", loopLabel));
        // Повторить, если x31 != 0
        // Извлечение цифр из стека
        final_code.append(String.format("%s:\n", popLabel));
        final_code.append("addi x28, x28, -4\n"); // Уменьшить указатель стека
        final_code.append("lw x29, x28, 0\n"); // Извлечь цифру из стека
        final_code.append("ewrite x29\n"); // Вывести символ
        final_code.append(String.format("bne x28, x0, %s\n", popLabel));
        final_code.append(String.format("%s:\n", endLabel));
    }

    @Override
    public String visitExpression(mylangParser.ExpressionContext ctx) {
        if (ctx.DIGIT() != null) {
            int reg = current_reg;
            if (!var_reg.values().contains(reg)) {
                reg = current_reg++;
                final_code.append(String.format("li x%d, %s\n", reg,
                        ctx.DIGIT().getText()));
                return String.valueOf(reg);
            }
            return ctx.DIGIT().getText();
        } else if (ctx.VAR_NAME() != null) {
            String varName = ctx.VAR_NAME().getText();
            if (!var_reg.containsKey(varName)) {
                throw new RuntimeException("переменная " + varName + " не объявлена.");
            }
            int reg = current_reg++;
            // загрузка во временный регистр значения
            final_code.append(String.format("addi x%d, x%d, 0\n", reg,
                    var_reg.get(varName)));
            return String.valueOf(reg);
        } else if (ctx.BOOL_LITERAL() != null) {
            int reg = current_reg;
            int value = ctx.BOOL_LITERAL().getText().equals("(T)") ? 1 : 0;
            if (!var_reg.values().contains(reg)) {
                reg = current_reg++;
                value = ctx.BOOL_LITERAL().getText().equals("(T)") ? 1 : 0;
                final_code.append(String.format("li x%d, %d\n", reg, value));
                return String.valueOf(reg);
            }
            return String.valueOf(value);
        } else if (ctx.NEGATE() != null) {
            int exprReg =
                    Integer.parseInt(visitExpression(ctx.expression(0)));
            int reg = current_reg++;
            final_code.append(String.format("xori x%d, x%d, 1\n", reg,
                    exprReg));
            return String.valueOf(reg);
        } else if (ctx.OPEN_PAREN() != null && ctx.CLOSE_PAREN() != null) {
            return visitExpression(ctx.expression(0));
        } else if (ctx.ADD() != null || ctx.SUB() != null ||
                ctx.MULT() != null || ctx.DIVIDE() != null || ctx.REMAIN() !=
                null) {
            int leftReg =
                    Integer.parseInt(visitExpression(ctx.expression(0)));
            int rightReg =
                    Integer.parseInt(visitExpression(ctx.expression(1)));
            int reg = current_reg++;
            if (ctx.ADD() != null) {
                final_code.append(String.format("add x%d, x%d, x%d\n", reg,
                        leftReg, rightReg));
            } else if (ctx.SUB() != null) {
                final_code.append(String.format("sub x%d, x%d, x%d\n", reg,
                        leftReg, rightReg));
            } else if (ctx.MULT() != null) {
                final_code.append(String.format("mul x%d, x%d, x%d\n", reg,
                        leftReg, rightReg));
            } else if (ctx.DIVIDE() != null) {
                final_code.append(String.format("div x%d, x%d, x%d\n", reg,
                        leftReg, rightReg));
            } else if (ctx.REMAIN() != null) {
                final_code.append(String.format("rem x%d, x%d, x%d\n", reg,
                        leftReg, rightReg));
            }
            return String.valueOf(reg);
        } else if (ctx.LT() != null || ctx.GT() != null || ctx.LTEQ() != null
                ||
                ctx.GTEQ() != null || ctx.EQ_OP() != null || ctx.NEQ_OP() !=
                null) {
            int leftReg =
                    Integer.parseInt(visitExpression(ctx.expression(0)));
            int rightReg =
                    Integer.parseInt(visitExpression(ctx.expression(1)));
            int reg = current_reg++;
            if (ctx.LT() != null) {
                final_code.append(String.format("slt x%d, x%d, x%d\n", reg,
                        leftReg, rightReg));
            } else if (ctx.GT() != null){
                final_code.append(String.format("slt x%d, x%d, x%d\n", reg,
                        rightReg, leftReg));
            } else if(ctx.LTEQ() != null) {
                final_code.append(String.format("sge x%d, x%d, x%d\n", reg,
                        rightReg, leftReg));
            } else if (ctx.GTEQ() != null) {
                final_code.append(String.format("sge x%d, x%d, x%d\n", reg,
                        leftReg, rightReg));
            } else if (ctx.EQ_OP() != null) {
                final_code.append(String.format("seq x%d, x%d, x%d\n", reg,
                        leftReg, rightReg));
            } else if (ctx.NEQ_OP() != null) {
                final_code.append(String.format("sne x%d, x%d, x%d\n", reg,
                        leftReg, rightReg));
            }
            return String.valueOf(reg);
        } else if (ctx.AND_OP() != null || ctx.OR_OP() != null) {
            int leftReg =
                    Integer.parseInt(visitExpression(ctx.expression(0)));
            int rightReg =
                    Integer.parseInt(visitExpression(ctx.expression(1)));
            int reg = current_reg++;
            if (ctx.AND_OP() != null) {
                final_code.append(String.format("and x%d, x%d, x%d\n", reg,
                        leftReg, rightReg));
            } else if (ctx.OR_OP() != null) {
                final_code.append(String.format("or x%d, x%d, x%d\n", reg,
                        leftReg, rightReg));
            }
            return String.valueOf(reg);
        }
        throw new UnsupportedOperationException("Неизвестное выражение.");
    }

    @Override
    public String visitBlock_comment(mylangParser.Block_commentContext
                                             ctx) {
        Pattern comment_regex = Pattern.compile("/\\*+\\s*(.*?)\\s*\\*+/",
                Pattern.DOTALL);
        Matcher matcher = comment_regex.matcher(ctx.COMM_BLOCK().getText());
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            String comment = matcher.group(1).trim();
            String[] lines = comment.split("\\R");
            StringBuilder ready_comment = new StringBuilder();
            for (String line : lines) {
                String cleaned = line.replaceAll("^\\*+|\\*+$", "").trim();
                ready_comment.append("#").append(cleaned).append("\n");
            }
            matcher.appendReplacement(result,
                    ready_comment.toString().trim());
        }
        matcher.appendTail(result);
        final_code.append(result.toString() + "\n");
        return null;
    }
}
