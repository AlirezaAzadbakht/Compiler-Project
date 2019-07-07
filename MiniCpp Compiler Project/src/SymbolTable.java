import java.util.ArrayList;

public class SymbolTable {
	private ArrayList<node> data;

	public SymbolTable() {
		data = new ArrayList<>();
	}

	public int Size() {
		return this.data.size();
	}

	public void add(String type, String id, Value value, String block) {
		node temp = new node(type, id, value, block);
		boolean found = false;
		for (node no : data) {
			if (no.equal(temp)) {
				if (!block.equals("funcDeclare")) {
					if(!no.getType().equals(type) && !type.equals("ass")){
						System.out.println(no.getType()+" "+type);
						throw new RuntimeException("double declare for variable: "+id);}
					no.setValue(temp.getValue());
					
				} else {
					if (!value.asString().equals(no.getValue().asString())) {
						throw new RuntimeException("function input/output not matched: " + id);
					}
				}

				found = true;
			}

		}
		if (!found) {
			this.data.add(temp);
		}

	}

	public int findByIdBlock(String id, String block) {
		for (node node : data) {
			if (node.getId().equals(id) && node.getBlock().equals(block)) {
				return node.getLocation();
			}
		}
		return -1;
	}

	public ArrayList<String> GetfuncInputs(String id) {
		for (node node : data) {
			if (node.getId().equals(id) && node.getBlock().equals("funcDeclare")) {
				return node.getValue().funcInputValues;
			}
		}
		return null;
	}

	public String GetfuncReturnType(String id) {
		for (node node : data) {
			if (node.getId().equals(id) && node.getBlock().equals("funcDeclare")) {
				return node.getType();
			}
		}
		return null;
	}

	public void print() {
		System.out.println("\tSysmbol Table\nType\tId\tLoc\tBlock\n");
		for (node node : data) {
			System.out.println(node.toString());
		}
		System.out.println("\n-------------------------");
	}

}

class node {
	private String id;
	private String type;
	private Value value;
	private int location;
	private String block;
	private static int i = 0;

	public node(String type, String id, Value value, String block) {
		this.type = type;
		this.id = id;
		this.value = value;
		this.location = i++;
		this.block = block;
	}

	@Override
	public String toString() {
		// System.out.println(value.funcInputValues);
		if (this.block.equals("funcDeclare")) {
			String result = "";
			for (String a : this.value.funcInputValues) {

				result = result + " " + a;
			}
			return this.type + "\t" + this.id + "\t" + this.location + "\t" + this.block + "\tinputs: " + result
					+ "\theader: " + this.value;
		}
		return this.type + "\t" + this.id + "\t" + this.location + "\t" + this.block;
	}

	public boolean equal(node nod) {
		if (this.id.equals(nod.id) && this.block.equals(nod.block))
			return true;
		return false;
	}

	public String getBlock() {
		return block;
	}

	public String getId() {
		return id;
	}

	public Value getValue() {
		return value;
	}

	public int getLocation() {
		return location;
	}

	public String getType() {
		return type;
	}

	public void setValue(Value value) {
		this.value = value;
	}
}
