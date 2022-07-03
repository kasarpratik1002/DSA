import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueueOptimized {
static class Stack{
		
		Queue<Integer> queue1;
		Stack(){
			queue1=new ArrayDeque<>();
		}
	
		

		@Override
		public String toString() {
			return "Stack [queue1=" + queue1 + "]";
		}



		public void push(int data) {
			
			
				queue1.add(data);
		
		for(int i=0;i<queue1.size()-1;i++) {
			int x=queue1.remove();
			queue1.add(x);
		}
		
		}
		
		public int pop() {
			if(queue1.isEmpty()) {
				System.out.println("Stack is empty");
				return -1;
			}
			return queue1.remove();
		}
		
		public int peek() {
			if(queue1.isEmpty()) {
				System.out.println("Stack is empty");
				return -1;
			}
			return queue1.peek();
		}
	}
	public static void main(String[] args) {
		
		Stack stack=new Stack();
		stack.push(12);
		stack.push(432);
		stack.push(322);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
