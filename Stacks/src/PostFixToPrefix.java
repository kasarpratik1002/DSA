import java.util.Stack;

public class PostFixToPrefix {

	public static void main(String[] args) {
		
		String postfix="ab+c+";
		
		Stack<String> stack=new Stack<>();
		for(int i=0;i<postfix.length();i++) {
			char c=postfix.charAt(i);
			if(Character.isLetterOrDigit(c)) {
				stack.push(c+"");
			}
			else {
				String op1=stack.pop();
				String op2=stack.pop();
				stack.push(c+op2+op1);
			}
		}
		System.out.println(stack.peek());
	}
}
