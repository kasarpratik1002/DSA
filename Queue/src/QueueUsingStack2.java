import java.util.Stack;

public class QueueUsingStack2 {

	
	static class Queue{
		
		Stack<Integer> s1;
		Stack<Integer> s2;
		
		Queue(){
			s1=new Stack<>();
			s2=new Stack<>();
			
		}
		
		public void add(int data) {
			
			s1.push(data);
		}
		
		public int remove() {
			if(s1.isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			int data=s2.pop();
			
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
			return data;
			
		}
		
		public int peek() {
			if(s1.isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			int data=s2.peek();
			
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
			return data;
		}
		
	}
	public static void main(String[] args) {
		
		Queue q=new Queue();
		q.add(12);
		q.add(32);
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.remove());
		
	}
}
