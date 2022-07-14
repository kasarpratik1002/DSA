import java.util.Stack;

public class prefixToPostfix {

	public static void main(String[] args) {
		
		String prefix="++abc";
		String reverse="";
		for(int i=prefix.length()-1;i>=0;i--) {
			reverse+=prefix.charAt(i);
		}
		
		Stack<String> stack=new Stack<>();
		for(int i=0;i<reverse.length();i++) {
			
			char c=reverse.charAt(i);
			
			if(Character.isLetterOrDigit(c)) {
				stack.push(c+"");
			}
			else {
				String op1=stack.pop();
				String op2=stack.pop();
				stack.push(op1+op2+c);
			}
			
		}
		System.out.println(stack.peek());
	}
}
