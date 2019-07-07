import java.util.Arrays;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.gui.TreeViewer;

public class Main {
	public static void main(String[] args) throws Exception {

		String INPUT_DIR = "test-asfix.mu";

		MiniCppLexer lexer = new MiniCppLexer(new ANTLRFileStream(INPUT_DIR));

		MiniCppParser parser = new MiniCppParser(new CommonTokenStream(lexer));

		System.out.println(">Start to Parse : \"" + INPUT_DIR + "\"");

		ParseTree tree = parser.parse();

		if (!tree.toStringTree().contains("<missing"))
			System.out.println("\n>\"" + INPUT_DIR + "\" Accepted");
		else {
			System.out.println("\n>\"" + INPUT_DIR + "\" Rejected");
			return;
		}

		System.out.println("\n>Drawing Parse Tree");
		JFrame frame = new JFrame("Antlr AST");
		JPanel panel = new JPanel();
		TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
		viewr.open();

		Evaler visitor = new Evaler();
		try {
			visitor.visit(tree);

			if (visitor.seenBody != visitor.seenDeclare) {
				throw new RuntimeException("some functions not declared");
			}

			visitor.PB.PrintGeneratedCode(true);

			visitor.st.print();

			System.out.println("\n>Done");
		} catch (Exception e) {
			System.out.println("\n>Code Generation Error");

			System.err.println(e.getMessage());
		}

	}
}
// Finished On Song : Twin Flames - In This Moment 