import java.util.ArrayDeque;
import java.util.Deque;
// deque can be implemented using linkedlist or Arraydeque
public class ArrayDequeueCollection {

	
	public static void main(String[] args) {
		
		
		Deque<Integer> deque=new ArrayDeque<>();
		//below operations will throw exception if empty or full or any other "No such element exception"
		///////////////////////////////////////
		deque.addFirst(12);
		deque.addLast(32);
		deque.addFirst(325);
		deque.addLast(3235);

		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		
		deque.removeFirst();
		deque.removeLast();
		deque.removeLast();
		deque.removeFirst();
//		deque.removeFirst();
		
		
		//////////////////////////////
		// Below operations will not throw an exceptions they will return null
		deque.offerFirst(12);
		deque.offerFirst(13);
		deque.offerFirst(14);
		deque.offerFirst(15);
		
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());
		
		deque.pollFirst();
		deque.pollLast();
		deque.pollFirst();
		deque.pollLast();
		deque.pollLast();
		
	}
}
