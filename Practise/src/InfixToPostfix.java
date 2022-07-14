import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the infix");
		String infix=in.nextLine();
		
		String postfix=infixToPostfix(infix);
		System.out.println(postfix);
		
		System.out.println("result is "+EvaluatePostfix.evaluatePostfix(postfix));
		in.close();
	}

	private static String infixToPostfix(String infix) {

		
		Stack<Character> stack=new Stack<>();
		String result="";
		for(int i=0;i<infix.length();i++) {
			
			char c=infix.charAt(i);
			
			if(Character.isLetterOrDigit(c)) {
				result+=c;
			}else {
				if(c=='('||(isOperator(c)&&stack.isEmpty())) {
					stack.push(c);
				}else {
					if(isOperator(c)&&!stack.isEmpty()) {
						if(checkPrecedence(c)>checkPrecedence(stack.peek())) {
							stack.push(c);
						}else {
							while(!stack.isEmpty()&& checkPrecedence(c)<=checkPrecedence(stack.peek())) {
								result+=stack.pop();
							}
							stack.push(c);
						}
					}
				}
				
			}
			if(c==')') {
				while(stack.peek()!='('&&!stack.isEmpty()) {
					result+=stack.pop();
				}
				stack.pop();
			}
			
			
		}
		
		while(!stack.isEmpty()) {
			result+=stack.pop();
		}
		return result;
	}

	private static int checkPrecedence(char c) {
		
		switch(c) {
		case '+':
		case '-':
				return 1;
		case '*':
		case '/':
				return 2;
		case '^': return 3;
		default: return -1;
		}
		
	}

	private static boolean isOperator(char c) {
		return (c=='+'||c=='*'||c=='/'||c=='-'||c=='^');
	}
}
