package entity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class parsTable {
	private ArrayList<parsTable_node> table;

	public parsTable() {
		table = new ArrayList<>();

	}

	public void printTable() {
		System.out.println("===================================================\nParsTable\n");
		for (parsTable_node node : table) {
			System.out.println(node.toString());
		}
		System.out.println("===================================================");
	}

	public void init(String[][] table) throws IOException {

		for (int i = 1; i < table.length; i++) {
			for (int j = 1; j < table[0].length; j++) {
				if (table[i][j] != null) {
					parsTable_node temp = new parsTable_node(table[i][0], table[0][j], table[i][j]);
					this.table.add(temp);
				}
			}
		}

	}

	public ArrayList<String> find(String nonTerminal, String terminal) {
		System.out.println(nonTerminal + " " + terminal);
		ArrayList<String> result = new ArrayList<>();

		Boolean flag = false;
		for (parsTable_node nod : table) {
			if (nod.nonTerminal.equals(nonTerminal) && nod.terminal.equals(terminal)) {
				flag = true;
				StringTokenizer st = new StringTokenizer(nod.productionRule, " ");
				while (st.hasMoreTokens()) {
					result.add(st.nextToken());
				}
				break;
			}
		}
		// error handeling when record not found
		if (flag == false) {
			result.add("error");
		}
		System.out.println(result);
		return result;
	}

}
