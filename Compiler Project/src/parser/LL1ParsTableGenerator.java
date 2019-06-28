package parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import entity.parsTable;
import entity.parsTable_node;

public class LL1ParsTableGenerator {
	private parsTable pt;
	public LL1ParsTableGenerator() {
		pt = new parsTable();
	}
	public void init (String GrammerDir) throws IOException{
		File file = new File(GrammerDir);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null) {
			System.out.println(st);
		}
		
	}
	
	
	

}
