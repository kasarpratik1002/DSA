import java.util.Scanner;
import java.util.Stack;

public class ParanthesisMatch {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = in.nextLine();
		boolean check = isValidParanthesis(str);
		System.out.println(check);
		in.close();
	}

	private static boolean isValidParanthesis(String str) {

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			if (isOpening(c)) {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				} else {
					if (!isMatching(stack.peek(), c)) {
						return false;
					}
					stack.pop();

				}
			}
		}

		return stack.isEmpty();
	}

	private static boolean isMatching(Character peek, char c) {
		return ((c == ')' && peek == '(') || (c == ']' && peek == '[') || (c == '}' && peek == '{'));

	}

	private static boolean isOpening(char c) {

		return (c == '(' || c == '[' || c == '{');
	}

}
