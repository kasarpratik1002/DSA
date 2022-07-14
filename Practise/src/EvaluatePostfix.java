import java.util.Stack;

public class EvaluatePostfix {

	public static String evaluatePostfix(String postfix) {
		
		Stack<String> stack=new Stack<>();
		
		for(int i=0;i<postfix.length();i++) {
			char c=postfix.charAt(i);
			if(Character.isLetterOrDigit(c)) {
				stack.push(c+"");
			}
			else {
				String op1=stack.pop();
				String op2=stack.pop();
				
				String result=evaluate(op1,op2,c);
				stack.push(result);
			}
		}
		return stack.peek();
	}

	private static String evaluate(String op1, String op2, char c) {

		
		switch(c) {
		case '+':
				return String.valueOf(Integer.parseInt(op2)+Integer.parseInt(op1));
		case '-':
				return String.valueOf(Integer.parseInt(op2)-Integer.parseInt(op1));
		case '*': return String.valueOf(Integer.parseInt(op2)*Integer.parseInt(op1));	
		case '/':return String.valueOf(Integer.parseInt(op2)/Integer.parseInt(op1));
		case '^':return String.valueOf((int)Math.pow(Integer.parseInt(op2), Integer.parseInt(op1)) );
		default: return "invalid";
		}
	}

}
