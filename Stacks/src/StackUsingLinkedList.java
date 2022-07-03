
public class StackUsingLinkedList {

	static Node head=null;
	
	static class Node{
		
		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	static class Stack{
		
		public void push(int data) {
			Node node=new Node(data);
			if(isEmpty()) {
				head=node;
				return;
			}
			node.next=head;
			head=node;
			
		}

		private boolean isEmpty() {
			return head==null;
		}
		
		public int pop() {
			
			if(isEmpty()) {
				return -1;
			}
			
			int data=head.data;
			head=head.next;
			return data;
		}
		
		public int peek() {
			if(isEmpty()) {
				return -1;
			}
			return head.data;
		}
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Stack using linked list");
		
		
		
		Stack stack=new Stack();
		stack.push(12);
		stack.push(122);
		stack.push(3222);
	    stack.push(0);
	while(!stack.isEmpty()) {
		System.out.println(stack.pop());
	}
	System.out.println(stack.pop());
	}
}
