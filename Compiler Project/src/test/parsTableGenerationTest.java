package test;

import java.io.IOException;

import parser.LL1ParsTableGenerator;

public class parsTableGenerationTest {

	public static void main(String[] args) throws Exception {
		LL1ParsTableGenerator ptg = new LL1ParsTableGenerator();
		ptg.init("sample1.txt");
	}

}