
import java.io.*;
import java.util.ArrayList;

import entity.SymbolTable;
import entity.token;
import grammar.*;

public class Main {

	public static void main(String[] argv) {
		try {
			Reader reader = new FileReader("HelloWorld2.cpp");
			myLexer lexer = new myLexer(reader);
			SymbolTable st = new SymbolTable();
			lexer.yylex();
			
			//lexer.tokens.stream().forEach(y->System.out.println(y.toString())); 
			lexer.st.printTable();
			lexer.printTokens();
			//throw new Exception("test");

		} catch (Exception exception) {
			System.out.println("Exception in Main " + exception.toString());
			exception.printStackTrace();
		}
	}
	
	
}