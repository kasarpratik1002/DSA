/*
 * Time complexity of Add is O(1)
 * Time complexity of remove is O(n) because of shifting so that's why Using circular queue is recommended 
 */
public class SimpleQueue {

	static class Queue{
		
		int rear;
		int front;
		int queue[];
		Queue(int capacity){
			 rear=-1;
			 front =-1;
			 queue=new int[capacity];
		}
		
		
		
		//Enqueue
		public void add(int data) {
			if(isFull()) {
				System.out.println("Queue is Full");
				return;
			}
			
			if(front==-1) {
				front++;
			}
			queue[++rear]=data;
			
		}
		
		//Dequeue
		public int remove() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			int data=queue[front];
			for(int i=0;i<rear;i++) {
				queue[i]=queue[i+1];
				
			}
			rear--;
			return data;
			
			
		}

		private boolean isFull() {
			return rear==queue.length-1;
		}

		private boolean isEmpty() {
			return rear==-1;
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
		//queue.add(60);
		System.out.println(queue.peek());
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		//queue.remove();
		System.out.println(queue.peek());
	}
}
