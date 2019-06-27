package entity;

public class parseTable_node {

	String nonTerminal;
	String terminal;
	String productionRule;

	public parseTable_node(String nonTerminal, String terminal, String productionRule) {
		this.nonTerminal = nonTerminal;
		this.terminal = terminal;
		this.productionRule = productionRule;
	}

}
