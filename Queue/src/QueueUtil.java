import java.util.LinkedList;
import java.util.Queue;

public class QueueUtil {

	public static void main(String[] args) {
		
		Queue<Integer> queue=new LinkedList<>();
		
		queue.add(12);
		System.out.println(queue.peek());
		queue.add(14);
		queue.add(111);
		queue.add(145);
		System.out.println(queue.peek());
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
	}
}
