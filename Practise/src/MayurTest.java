import java.util.Stack;

public class MayurTest {

	public static void main(String[] args) {

		String s = "aabbbcabbcccceewwq";

		getnewString(s);
	}

	private static void getnewString(String s) {

		Stack<Character> stack = new Stack<>();
		String output = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (stack.isEmpty() || stack.peek() == c) {
				stack.push(c);
				count++;
			}
			if (stack.peek() != c) {
				output = output + stack.peek() + String.valueOf(count);
				stack.push(c);
				count = 1;
			}

		}
		output+=stack.peek()+String.valueOf(count);
		System.out.println("the output string is " + output);
	}
}
