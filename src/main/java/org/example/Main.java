package org.example;

import antlr.mylangLexer;
import antlr.mylangParser;
import antlr.mylangVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            String inputFile = args.length > 0 ? args[0] : "D:\\Compiler_final\\src\\main\\resources\\program4.txt";
            FileInputStream fileInputStream = new FileInputStream(inputFile);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            CharStream charStream = CharStreams.fromReader(inputStreamReader);

            mylangLexer lexer = new mylangLexer(charStream);

            // 3. Tạo Parser
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            mylangParser parser = new mylangParser(tokens);

            // 4. Tạo AST
            ParseTree tree = parser.program();

            MyLangVisitor visitor = new MyLangVisitor();
            visitor.visit(tree);

            System.out.println(visitor.getCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}