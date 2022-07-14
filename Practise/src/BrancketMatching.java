import java.util.Stack;

public class BrancketMatching {

	public static void main(String[] args) {
		String s="{}{}{}{";
		
		
		boolean check=checkBrackets(s);
		System.out.println(check);
	}

	private static boolean checkBrackets(String s) {

		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
			if(isOpening(c)) {
				stack.push(c);
			}
			else {
				if(stack.isEmpty()) {
					return false;
				}
				else {
					if(!isMatching(stack.peek(),c)) {
						return false;
					}
					stack.pop();
				}
			}
		}
		
		return stack.isEmpty();
	}

	private static boolean isMatching(Character peek, char c) {
		return (peek=='('&&c==')')||(peek=='['&&c==']')||(peek=='{'&&c=='}');
	}

	private static boolean isOpening(char c) {
		return (c=='('||c=='{'||c=='[');
	}
}
