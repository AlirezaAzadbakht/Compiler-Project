package entity;

public class parsTable_node {

	String nonTerminal;
	String terminal;
	String productionRule;

	public parsTable_node(String nonTerminal, String terminal, String productionRule) {
		this.nonTerminal = nonTerminal;
		this.terminal = terminal;
		this.productionRule = productionRule;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + this.nonTerminal + " , " + this.terminal + "] = " + this.productionRule;
	}

}
