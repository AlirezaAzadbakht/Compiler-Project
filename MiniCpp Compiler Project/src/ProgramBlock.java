import java.util.*;

public class ProgramBlock {

	private int MAX_PROGRAM_BLOCK_SIZE;

	private int PBindex;

	private String[] ProgramBlock;

	public ProgramBlock(int maxSize) {
		this.MAX_PROGRAM_BLOCK_SIZE = maxSize;

		this.PBindex = 0;

		this.ProgramBlock = new String[MAX_PROGRAM_BLOCK_SIZE];
	}

	public void add(String targetCode) {
		if (this.PBindex == this.MAX_PROGRAM_BLOCK_SIZE - 1)
			throw new RuntimeException("ProgramIndex reached Max Size");
		this.ProgramBlock[PBindex] = targetCode;
		this.PBindex++;
	}

	public void merge(int index, String targetCode) {
		this.ProgramBlock[index]+=targetCode;
	}

	public void change(int index, String targetCode) {
		this.ProgramBlock[index] = targetCode;
	}

	public String get(int index) {
		return ProgramBlock[index];
	}

	public void PrintGeneratedCode(Boolean withLineCounter) {
		System.out.println("\n-----Generated Code-----\n");
		int i = 1;
		for (String string : ProgramBlock) {
			if (string == null)
				break;

			if (withLineCounter)
				System.out.print(i + "\t");
			System.out.println(string);
			i++;
		}
		System.out.println("\n------------------------\n");
	}

	public void PrintGeneratedCode() {
		System.out.println("\n-----Generated Code-----\n");
		for (String string : ProgramBlock) {
			if (string == null)
				break;

			System.out.println(string);
		}
		System.out.println("\n------------------------\n");
	}

	public String[] getProgramBlock() {
		return ProgramBlock;
	}

	public int getIndex() {
		return PBindex;
	}

	public int getMAX_PROGRAM_BLOCK_SIZE() {
		return MAX_PROGRAM_BLOCK_SIZE;
	}

	public int getProgramBlockIndex() {
		return PBindex;
	}

	public String getIndexSTR() {
		return String.valueOf(this.PBindex);
	}
	
	public String getNextIndexSTR() {
		return String.valueOf(this.PBindex+1);
	}
}
