package element;

import java.util.Stack;

/**
 * @author Priya Pandey
 *
 */
public class OrganicMoleculeMass {
	private Stack<Element> stack = new Stack<Element>();

	/**
	 * Calculates the molecular mass of organic compounds
	 * @param compound
	 * @return molecular mass
	 */
	public int evaluate(String compound) {
		// Append a right bracket to string
		String input = compound.toUpperCase() + ")";
		int totalMass = 0;
		// Push a left bracket to stack
		stack.push(new Element('(', 1));
		for (int index = 0; index < input.length(); index++) {
			char symbol = input.charAt(index);
			// Pushing the elements to stack
			switch (symbol) {
			case 'C':
			case 'H':
			case 'O':
				int base = baseMaker(input.substring(index));
				stack.push(new Element(symbol, base));
				break;
			case '(':
				stack.push(new Element('(', 1));
				break;
			// If right bracket is encounter we will pop the stack until left
			// bracket is found
			// and evaluate the bracket for the final result
			case ')':
				if (index == input.length() - 1) {
					totalMass += eval(1);
				} else {
					base = baseMaker(input.substring(index));
					totalMass += eval(base);
				}
			}
		}
		stack.clear();
		return totalMass;
	}
    
   
	public int baseMaker(String subCompound) {
		int digit = 0;
		for (int index = 1; index < subCompound.length(); index++) {
			char symbol = subCompound.charAt(index);
			if (Character.isDigit(symbol)) {
				digit = digit * 10 + (int) (symbol - '0');
			} else {
				break;
			}
		}
		if (digit == 0) {
			return 1;
		}
		return digit;
	}
   

	private int eval(int base) {
		int subMass = 0;
		Element e;
		while (true) {
			e = stack.pop();
			// Pop until left bracket is found
			if (e.getSymbol() == '(') {
				break;
			} else {
				switch (e.getSymbol()) {
				case 'C':
					subMass += (12 * e.getBase());
					break;
				case 'O':
					subMass += (16 * e.getBase());
					break;
				case 'H':
					subMass += (1 * e.getBase());
					break;
				}

			}
		}
		return (subMass * base);
	}
}