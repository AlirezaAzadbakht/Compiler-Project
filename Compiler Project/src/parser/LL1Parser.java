package parser;

import java.util.*;

import entity.parsTable;
import entity.token;

public class LL1Parser {
	ArrayList<token> ts;
	parsTable pt;

	public LL1Parser(ArrayList<token> tokenStream, parsTable parsTable) {
		this.ts = tokenStream;
		this.pt = parsTable;
	}

	public boolean pars() {
		Stack<String> stack = new Stack<>();
		stack.push("$");
		// TODO fix it chi aval bashe???
		stack.push("E");
		int tsIndex = 0;

		while (!stack.peek().equals("$")) {
			// TODO token ya tokentype????
			ArrayList<String> productionRule = pt.find(stack.pop(), ts.get(tsIndex).getTokenType());
			if (!productionRule.get(0).equals("error")) {
				for (int i = productionRule.size(); i >= 0; i--) {
					if (!productionRule.get(i).equals("epsilon"))
						stack.push(productionRule.get(i));
				}
			} else {
				return false;
			}
		}

		return true;
	}

}
