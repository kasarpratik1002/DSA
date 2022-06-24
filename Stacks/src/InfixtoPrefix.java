import java.util.Stack;

public class InfixtoPrefix {

	public static void main(String[] args) {

		String s = "d*c-b+a";
		String reverse = reverse(s);

		String finalstr = infixToPrefix(reverse);
		System.out.println(finalstr);

	}

	private static String reverse(String s) {
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '(') {
				reverse += ')';
			}
			if (s.charAt(i) == ')') {
				reverse += '(';
			}
			if (!(s.charAt(i) == '(' || s.charAt(i) == ')')) {
				reverse += s.charAt(i);
			}

		}
		return reverse;
	}

	private static String infixToPrefix(String reverse) {

		String result = "";
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < reverse.length(); i++) {

			char c = reverse.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				result += c;
			} else {
				if (c == '(' || (isOperator(c) && stack.isEmpty())) {
					stack.push(c);
				} else {
					if (isOperator(c) && !stack.isEmpty()) {
						if (checkPrecedence(c) > checkPrecedence(stack.peek())) {
							stack.push(c);
						} else {
							if ((checkPrecedence(c) == checkPrecedence(stack.peek())) && c != '^') {
								stack.push(c);
							} else {
								while (!stack.isEmpty()&& checkPrecedence(c) <= checkPrecedence(stack.peek())) {
									result+=stack.pop();
								}
								stack.push(c);
							}
						}
					}
				}
			}

			if(c==')') {
				while(stack.peek()!='(') {
					result+=stack.pop();
				}
				stack.pop();
				
			}
			
		}
		while(!stack.isEmpty()) {
			result+=stack.pop();
		}
		
		return reverse(result);
	}

	private static int checkPrecedence(Character peek) {

		switch (peek) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default:
			return -1;
		}
	}

	private static boolean isOperator(char c) {
		return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
	}

}
