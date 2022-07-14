import java.util.Arrays;

public class DequeueCore {

	static class Dequeue{
		
		@Override
		public String toString() {
			return "Dequeue [front=" + front + ", rear=" + rear + ", queue=" + Arrays.toString(queue) + ", n=" + n
					+ "]";
		}
		int front;
		int rear;
		int queue[];
		int n;
		Dequeue(int capacity){
			front=-1;
			rear=-1;
			n=capacity;
			queue=new int [capacity];
		}
		public boolean isFull() {
			return ((rear+1)%n==front);
		}
		
		//insert from front
		public void addfirst(int data) {
			if(isFull()) {
				System.out.println("Queue is full");
				return ;
				
			}
			
			
			if(isEmpty()) {
				front=rear=0;
			}
			else if(front==0) {
				front=n-1;
			}else {
				front--;
			}
			queue[front]=data;
			
		}
		
		public void addLast(int data) {
			if(isFull()) {
				System.out.println("Queue is full");
				return;
			}
			if(front==-1) {
				front=0;
			}
			
			rear=(rear+1)%n;
			queue[rear]=data;
			
			
		}
		
		public int removeFirst() {
			
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
				front=(front+1)%n;
			}
			
			return data;
		}
		
		private boolean isEmpty() {
			return front==-1&&rear==-1;
		}
		
		public int removeLast() {
			
			if(isEmpty()) {
				System.out.println("Queque is empty");
				return -1;
			}
			int data=queue[rear];
			queue[rear]=Integer.MIN_VALUE;
			if(rear==front) {
				rear=front=-1;
			}else if(rear==0) {
				rear=n-1;
			}else {
				rear--;
			}
			return data;
			
		}
		
		public int getFirst() {
			return queue[front];
		}
		public int getLast() {
			return queue[rear];
		}
	}
	
	public static void main(String[] args) {
		
		Dequeue deque=new Dequeue(5);
		
		deque.addfirst(10);
		deque.addLast(100);
		deque.addfirst(13);
		deque.addLast(144);
		deque.addfirst(111);
		deque.addfirst(0);
		System.out.println(deque.getLast());
		System.out.println(deque.getFirst());
		deque.removeFirst();
		deque.removeLast();
		deque.removeFirst();
		deque.removeLast();
		deque.removeLast();
		deque.removeLast();
	}
}
