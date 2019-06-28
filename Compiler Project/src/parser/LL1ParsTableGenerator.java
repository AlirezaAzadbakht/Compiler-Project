package parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import entity.parsTable;
import entity.parsTable_node;

public class LL1ParsTableGenerator {

	public LL1ParsTableGenerator() {

	}

	public parsTable init(String GrammerDir) throws Exception {

		grammer grammar = new grammer(GrammerDir);
		FirstAndFollow f = new FirstAndFollow();
		f.First(grammar);
		f.Follow(grammar);
		grammar.print();
		System.out.println("========");
		ArrayList<first> first = f.first;
		ArrayList<follow> follow = f.follow;
		 f.printFirst();
		 f.printFollow();
		parseTable pt = new parseTable(first, follow);
		pt.table = new String[grammar.nonTerminals.size() + 1][grammar.terminals.size() + 2];
		pt.filler(grammar);

		parsTable result = new parsTable();
		result.init(pt.table);
		return result;
	}

}
