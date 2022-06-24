import java.util.Stack;

public class PrefixtoPostfix {

	public static void main(String[] args) {
		
		String prefix="++abc";
		String reverse = reverse(prefix);
		System.out.println(preToPost(prefix));
	System.out.println(infixtoPostFix(reverse));	
	}

	private static String reverse(String prefix) {
		String reverse="";
		
		for(int i=prefix.length()-1;i>=0;i--) {
			reverse+=prefix.charAt(i);
		}
		return reverse;
	}

	private static String infixtoPostFix(String reverse) {

		
		Stack<String> stack=new Stack<>();
		
		
		
		for(int i=0;i<reverse.length();i++) {
			char c=reverse.charAt(i);
			if(Character.isLetterOrDigit(c)) {
				stack.push(c +"");
			}
			else if(isOperator(c)) {
				String b=stack.pop();
				String a=stack.pop();
				stack.push(b+a+c);
			}
		}
		return stack.pop();
	}

	private static boolean isOperator(char c) {
		return (c=='+'||c=='/'||c=='*'||c=='-'||c=='^');
	}
	
	
	static String preToPost(String pre_exp)
    {
 
        Stack<String> s = new Stack<String>();
 
        // length of expression
        int length = pre_exp.length();
 
        // reading from right to left
        for (int i = length - 1; i >= 0; i--)
        {
            // check if symbol is operator
            if (isOperator(pre_exp.charAt(i)))
            {
                // pop two operands from stack
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();
 
                // concat the operands and operator
                String temp = op1 + op2 + pre_exp.charAt(i);
 
                // Push String temp back to stack
                s.push(temp);
            }
 
            // if symbol is an operand
            else {
                // push the operand to the stack
                s.push(pre_exp.charAt(i) + "");
            }
        }
 
        // stack contains only the Postfix expression
        return s.peek();
    }
}
