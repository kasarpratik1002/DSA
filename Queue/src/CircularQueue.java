import java.util.Arrays;

public class CircularQueue {

	static class Queue{
		@Override
		public String toString() {
			return "Queue [front=" + front + ", rear=" + rear + ", queue=" + Arrays.toString(queue) + ", n=" + n + "]";
		}

		int front;
		int rear;
		int queue[];
		int n;
		Queue(int capacity){
			front=-1;
			rear=-1;
			queue=new int[capacity];
			n=capacity;
		}
		
		

		//Enqueue
		public void add(int data) {
			if(isFull()) {
				System.out.println("Queue is Full");
				return;
			}
			if(front==-1) {
				front=(front+1)%n;
			}
			rear=(rear+1)%n;
			queue[rear]=data;
			
		}
		
		//Dequeue
		public int remove() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			int data=queue[front];
			queue[front]=Integer.MIN_VALUE;
			
			if(front==rear) {
				front=rear=-1;
			}
			else {
				front =(front+1)%n;
			}
			return data;
			
			
		}

		private boolean isFull() {
			return (rear+1)%n==front;
		}

		private boolean isEmpty() {
			return front==-1&&rear==-1;
		}
		
		//front
		private int peek() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			return queue[front];
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Queue queue=new Queue(5);
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		System.out.println(queue.peek());
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		System.out.println(queue.peek());
	}
}
