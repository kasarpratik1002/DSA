
public class QueueUsingLinkedList {

	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	
	static class Queue{
		
		Node front=null;
		Node rear=null;
		
		public void add(int data) {
			
			Node node=new Node(data);
			
			if(front==null) {
				front =node;
			}
			if(rear==null) {
				rear=node;
				return;
			}
			rear.next=node;
			rear=rear.next;
			
		}
		
		public int remove() {
			
			if(isEmpty()) {
				return -1;
			}
			
			int data=front.data;
			
			if(front==rear) {
				front=rear=null;
			}else {
				front=front.next;
			}
			return data;
		}

		private boolean isEmpty() {
				
			
			return front==null&&rear==null;
		}
		
		public int peek() {
			if(isEmpty()) {
				return -1;
			}
			return front.data;
		}
		
	}
	public static void main(String[] args) {
		
		Queue q=new Queue();
		q.add(12);
		q.add(32);
		q.add(54);
		q.add(22);
		
		System.out.println(q.peek());
		
		System.out.println("Queue is ");
		while(!q.isEmpty()) {
			System.out.println(q.remove());
		}
		System.out.println(q.remove());
	}
}
