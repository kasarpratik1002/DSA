import java.util.Stack;

public class StackUsingLibrary {
	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<>();
		Integer push = stack.push(12);
		System.out.println(push);
		Integer pop = stack.pop();
		System.out.println(pop);
	}

}
