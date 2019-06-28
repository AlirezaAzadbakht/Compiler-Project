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
			String nonTerminal = stack.pop();
			String terminal = "$";
			if (!(tsIndex == ts.size())) {
				terminal = ts.get(tsIndex).getTokenType();

				switch (terminal) {
				case "symbol":
					terminal = ts.get(tsIndex).getToken();
					break;

				default:
					break;
				}
			}
			ArrayList<String> productionRule = pt.find(nonTerminal, terminal);
			if (!productionRule.get(0).equals("error")) {
				for (int i = productionRule.size() - 1; i >= 0; i--) {
					if (!productionRule.get(i).equals("epsilon"))
						stack.push(productionRule.get(i));
				}
			} else {
				return false;
			}
			if (!(tsIndex == ts.size())) {
				if (stack.peek().equals(ts.get(tsIndex).getTokenType())
						|| stack.peek().equals(ts.get(tsIndex).getToken())) {
					System.out.println(stack.peek() + " - matched");
					tsIndex++;
					stack.pop();
				}
			}

		}

		return true;
	}

}
