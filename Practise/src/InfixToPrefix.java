import java.util.Scanner;
import java.util.Stack;

public class InfixToPrefix {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the infix");
		String infix = in.nextLine();

		infix = reverse(infix);
		System.out.println("Reversed infix is " + infix);
		String prefix = infixToPrefix(infix);
		System.out.println(prefix);

		System.out.println("result is " + EvaluatePrefix.evaluatePostfix(prefix));
		in.close();
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

	private static String infixToPrefix(String infix) {

		Stack<Character> stack = new Stack<>();
		String result = "";
		for (int i = 0; i < infix.length(); i++) {
			char c = infix.charAt(i);

			if (Character.isLetterOrDigit(c)) {
				result += c;
			} else {
				if (c == '(' || (isOperator(c) && stack.isEmpty())) {
					stack.push(c);

				} else {
					if (isOperator(c) && !stack.isEmpty()) {
						if ((checkPrecedence(c) > checkPrecedence(stack.peek()))) {
							stack.push(c);

						}else {
							if((checkPrecedence(c)==checkPrecedence(stack.peek())&&(c!='^'&&stack.peek()!='^'))) {
								stack.push(c);
							}
							else if((checkPrecedence(c)==checkPrecedence(stack.peek())&&(c=='^'&&stack.peek()=='^'))) {
								
								while(!stack.isEmpty()&&((checkPrecedence(c)==checkPrecedence(stack.peek()))&&(c=='^'&&stack.peek()=='^'))) {
									result+=stack.pop();
								}
								stack.push(c);
							}
							else if(checkPrecedence(c)<checkPrecedence(stack.peek())){
								while(!stack.isEmpty()&&(checkPrecedence(c)<checkPrecedence(stack.peek()))) {
									result+=stack.pop();
								}
								stack.push(c);
							}
						}
						
						
					}
				}
				if(c==')') {
					while(!(stack.peek()=='(')) {
						result+=stack.pop();
						
					}
					stack.pop();
				}
			}

		}
		
		
		while(!stack.isEmpty()) {
			result+=stack.pop();
		}

		return reverse(result);

	}

	private static int checkPrecedence(char c) {

		switch (c) {
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
		return (c == '+' || c == '*' || c == '/' || c == '-' || c == '^');
	}
}
