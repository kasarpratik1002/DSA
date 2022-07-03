import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueue {

	static class Stack{
		
		Queue<Integer> queue1;
		Queue<Integer> queue2;
		Stack(){
			queue1=new ArrayDeque<>();
			queue2=new ArrayDeque<>();
		}
		
		
		@Override
		public String toString() {
			return "Stack [queue1=" + queue1 + ", queue2=" + queue2 + "]";
		}


		public void push(int data) {
			
			if(queue1.isEmpty()) {
				queue1.add(data);
			}else {
				while(!queue1.isEmpty()) {
					queue2.add(queue1.remove());
				}
				queue1.add(data);
			}
			while(!queue2.isEmpty()) {
				queue1.add(queue2.remove());
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
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
