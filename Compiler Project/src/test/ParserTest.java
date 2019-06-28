package test;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;

import entity.SymbolTable;
import entity.parsTable;

import entity.token;
import lexer.myLexer;
import parser.LL1Parser;

public class ParserTest {

	public static void main(String[] args) {

		try {
			/*
			 * Lexer part
			 */
			Reader reader = new FileReader("GrammerTest.txt");
			myLexer lexer = new myLexer(reader);
			SymbolTable st = new SymbolTable();
			lexer.yylex();

			ArrayList<token> tokenStream = lexer.tokens;

			lexer.st.printTable();
			lexer.printTokens();

			/*
			 * Parser part
			 */
			parsTable parsTable = new parsTable();
			parsTable.init("Grammer.txt");
			parsTable.printTable();
			LL1Parser parser = new LL1Parser(tokenStream, parsTable);
			boolean result = parser.pars();
			if(result)
				System.out.println("Compile Accepted");
			else
				System.out.println("Compile error");
			/*
			 * Code Generation part
			 */

		} catch (Exception exception) {
			System.out.println("Exception in Main " + exception.toString());
			exception.printStackTrace();
		}
	}

}
