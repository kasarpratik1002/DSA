import java.util.Scanner;
import java.util.Stack;

public class InfixToPostFix {
	
	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		
		System.out.println("Enter the infix notation");
		String infix=in.nextLine();
		
		String postFix=infixToPostfix(infix);
		EvaluatePostfix evaluate=new EvaluatePostfix();
	//	double result=evaluate.evaluatePostfix(postFix);
		
		System.out.println(postFix);
	//	System.out.println("Result is "+(int)result);
		in.close();
	}

	  public static String infixToPostfix(String exp) {
	      
	      Stack<Character> stack=new Stack<>();
	      String result="";
	      for(int i=0;i<exp.length();i++){
	          char c=exp.charAt(i);
	          if(Character.isLetterOrDigit(c)){
	              result+=c;
	          }else{
	             if(c=='('||(isOperator(c)&&stack.isEmpty())){
	              stack.push(c);
	          }
	          else{
	              if(isOperator(c)&&!stack.isEmpty()){
	                  
	                  while(!stack.isEmpty()&&checkprecendence(stack.peek())>=checkprecendence(c)){
	                      result+=stack.pop();
	                     
	                  }
	                   stack.push(c);
	                  if(checkprecendence(stack.peek())<checkprecendence(c)){
	                      stack.push(c);
	                  }
	              }
	          }
	          if(c==')'){
	              while(stack.peek()!='('){
	                  result+=stack.pop();
	              }
	              stack.pop();
	          }
	          
	      } 
	          }
	          
	      while(!stack.isEmpty()){
	          result+=stack.pop();
	      }
	      return result;
	    }
	    
	    public static int checkprecendence(char c){
	        
	        switch(c){
	            case '+':
	            case '-':
	                    return 1;
	            case '*':
	            case '/':
	                    return 2;
	            case '^':return 3;
	            default: return -1;
	        }
	    }
	    public static boolean isOperator(char c){
	        return (c=='*'||c=='^'||c=='+'||c=='/'||c=='-');
	    }
}
