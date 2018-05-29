package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		// This one works!
		assertTrue(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		Stack<String> bracket = new Stack<>();
		
		for (int i = 0; i < b.length(); i++) {
			bracket.push(""+b.charAt(i));
		}
		
		for (int i = 0; i < bracket.size(); i++) {
			if (bracket.peek().equals("}")) {
				bracket.pop();
				if (bracket.peek().equals("{")) {
					return true;
				}
			}
		}
		return false;
	}
}