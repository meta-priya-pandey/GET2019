package infixEvaluation;

/**
 * @author Priya Pandey
 *
 */
public class InfixEvaluation {
	private IStack<Integer> stack;
	private IStack<Character> ops;

	/**
	 * This method evaluates the infix string and returns the result.
	 * @param expression
	 */
	public int evaluate(String expression) {
		stack = new StackUsingLinkedList<Integer>();
		ops = new StackUsingLinkedList<Character>();

		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);

			if (Character.isDigit(c)) {
				int num = 0;
				while (Character.isDigit(c)) {
					num = num * 10 + (c - '0');
					i++;
					if (i < expression.length())
						c = expression.charAt(i);
					else
						break;
				}
				i--;
				stack.push(num);
			} else if (c == '(') {
				ops.push(c);
			} else if (c == ')') {
				while (ops.peek() != '(') {
					int output = performOperation(stack, ops);
					stack.push(output);
				}
				ops.pop();
			}

			else if (isOperator(c)) {
				while (!ops.isEmpty() && precedence(c) < precedence(ops.peek())) {
					int output = performOperation(stack, ops);
					stack.push(output);
				}
				ops.push(c);
			}
		}
		while (!ops.isEmpty()) {
			int output = performOperation(stack, ops);
			stack.push(output);
		}
		return stack.pop();
	}

	private int precedence(char c) {
		switch (c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}

	private boolean isOperator(char c) {
		return (c == '+' || c == '-' || c == '/' || c == '*' || c == '^');
	}

	public int performOperation(IStack<Integer> stack2, IStack<Character> ops2) {
		int a = stack.pop();
		int b = stack.pop();
		char operation = ops.pop();
		switch (operation) {
		case '+':
			return a + b;
		case '-':
			return b - a;
		case '*':
			return a * b;
		case '/':
			if (a == 0)
				throw new UnsupportedOperationException("Cannot divide by zero");
			return b / a;
		}
		return 0;
	}
}