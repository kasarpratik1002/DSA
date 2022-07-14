import java.util.Stack;

//The approach which is used here is taking O(n) time for push operation and for pop and peek it will take O(1)

public class QueueUsingStack1 {

	
	static class Queue{
		
		Stack<Integer> s1;
		Stack<Integer> s2;
		Queue(){
			s1=new Stack<>();
			s2=new Stack<>();
			
		}
		
		
		@Override
		public String toString() {
			return "Queue [s1=" + s1 + ", s2=" + s2 + "]";
		}

// takes O(n)
		public void add(int data) {
			
			if(s1.isEmpty()) {
				s1.push(data);
			}
			else {
				while(!s1.isEmpty()) {
					s2.push(s1.pop());
				}
				s1.push(data);
				while(!s2.isEmpty()) {
					s1.push(s2.pop());
				}
			}
		}
//Takes O(1)		
		public int remove() {
			if(s1.isEmpty()) {
				System.out.println("Stack is empty");
				return -1;
			}else {
				return s1.pop();
			}
		}
	//Takes O(1)	
		public int peek() {
			return s1.peek();
		}
	}
	public static void main(String[] args) {
		
		Queue queue=new Queue();
		
		queue.add(12);
		queue.add(14);
		queue.add(32);
		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
	}
}
