package entity;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class parseTable {
	private ArrayList<parseTable_node> table;

	public parseTable() {
		this.table = table;
	}

	public ArrayList<String> find(String nonTerminal, String terminal) {
		ArrayList<String> result = new ArrayList<>();

		Boolean flag = false;
		for (parseTable_node nod : table) {
			if (nod.nonTerminal == nonTerminal && nod.terminal == terminal) {
				flag = true;
				StringTokenizer st = new StringTokenizer(nod.productionRule, " ");
				while (st.hasMoreTokens()) {
					result.add(st.nextToken());
				}
			}
		}
		// error handeling when record not found
		if (flag == false) {
			result.add("error");
		}

		return result;
	}

}


