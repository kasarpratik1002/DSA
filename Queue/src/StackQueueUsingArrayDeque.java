import java.util.ArrayDeque;
import java.util.Deque;

public class StackQueueUsingArrayDeque {

	public static void main(String[] args) {
		
		Deque<Integer> deque=new ArrayDeque<>();

		// Implementing Queue using deque
		deque.offer(12);
		deque.offer(13);
		System.out.println(deque.peek());
		deque.poll();
		deque.poll();
		deque.add(12);
		deque.remove();
		deque.peek();
		//implementing stack using deque
		
		deque.push(12);
		deque.push(32);
		deque.push(44);
		deque.pop();
		System.out.println(deque.peek());
		deque.pop();
		deque.pop();
		
		
	}
}
