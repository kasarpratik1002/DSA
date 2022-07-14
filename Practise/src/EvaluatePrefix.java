import java.util.Stack;

public class EvaluatePrefix {

	public static String evaluatePostfix(String prefix) {

		prefix = reverse(prefix);
		String result = "";
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < prefix.length(); i++) {

			char c = prefix.charAt(i);

			if (Character.isLetterOrDigit(c)) {
				stack.push(c + "");
			} else {

				String op1 = stack.pop();
				String op2 = stack.pop();
				result = evaluate(op1, op2, c);
				stack.push(result);
			}
		}

		return stack.peek();
	}

	private static String evaluate(String op1, String op2, char c) {

		switch (c) {
		case '+':
			return String.valueOf(Integer.parseInt(op1) + Integer.parseInt(op2));
		case '-':
			return String.valueOf(Integer.parseInt(op1) - Integer.parseInt(op2));
		case '*':
			return String.valueOf(Integer.parseInt(op1) * Integer.parseInt(op2));
		case '/':
			return String.valueOf(Integer.parseInt(op1) / Integer.parseInt(op2));
		case '^':
			return String.valueOf((int) Math.pow(Integer.parseInt(op1), Integer.parseInt(op2)));
		default:
			return "invalid";
		}
	}

	private static String reverse(String infix) {
		String reverse = "";

		for (int i = infix.length() - 1; i >= 0; i--) {
			if (infix.charAt(i) == '(') {
				reverse += ')';
			} else if (infix.charAt(i) == ')') {
				reverse += '(';
			} else {
				reverse += infix.charAt(i);
			}

		}
		System.out.println(reverse);
		return reverse;
	}

}
