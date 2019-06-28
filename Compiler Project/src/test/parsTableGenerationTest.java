package test;

import java.io.IOException;

import entity.parsTable;
import parser.LL1ParsTableGenerator;

public class parsTableGenerationTest {

	public static void main(String[] args) throws Exception {
		LL1ParsTableGenerator PTG = new LL1ParsTableGenerator();
		parsTable parsTable = PTG.init("sample2.txt");

		parsTable.printTable();
	}

}
