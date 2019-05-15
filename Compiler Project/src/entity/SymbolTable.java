package entity;

import java.util.ArrayList;

public class SymbolTable {
	private ArrayList<String> table = new ArrayList<>();
	public SymbolTable() {
	}
	// return index of token if not return -1
	public int FindTokenIndex(String target) {
		int index = 0;
		for (String node : table) {
			if (node.equals(target))
				return index;
			index++;
		}
		return -1;
	}

	public int addToken(String target) {
		table.add(target);
		return table.size() - 1;
	}

	public int checkAndAddToken(String target) {
		int index = 0;
		for (String node : table) {
			if (node.equals(target))
				return index;
			index++;
		}
		return addToken(target);
	}
	
	public ArrayList<String> getTable() {
		return table;
	}
	
	public void printTable(){
		System.out.println("\n=======================");
		int index=0;
		System.out.format("%-15s%s\n\n", "index" , "Id");
		for (String node : table) {
			System.out.format("%-15s%s\n", index++ , node);
		}
		System.out.println("========================");
	}

}
