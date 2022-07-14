import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class PlayingWithQueue {

	public static void main(String[] args) {
		
		
		Queue<Integer> queue=new ArrayDeque<>();
		
		queue.add(12);
		queue.offer(32);
		queue.remove();
		queue.poll();
		queue.peek();
		//
		
		Deque<Integer> deque=new ArrayDeque<>();
		deque.offer(12);
		deque.poll();
		deque.add(32);
		deque.remove();
		
		
		deque.push(21);
		deque.pop();
		
		//
		deque.addFirst(32);
		deque.removeFirst();
		deque.offerFirst(32);
		deque.offerLast(32);
		//
		
		Queue<Integer> q=new LinkedList<>();
		q.add(32);
		q.remove();
		
		
		
		Deque<Integer>ff=new LinkedList<>();
	}
}
