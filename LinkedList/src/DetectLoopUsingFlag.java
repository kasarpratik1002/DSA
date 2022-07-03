public class DetectLoopUsingFlag {

	static Node head=null;
	
	@Override
	public String toString() {
		return "DetectLoopUsingFlag [head=" + head + "]";
	}
	static class Node{
		
		int data;
		
		
		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + ", visited=" + visited + "]";
		}
		Node next;
		boolean visited;
		Node(int data){
			this.data=data;
			this.next=null;
			this.visited=false;
		}
	}
	
	public boolean detectLoop(Node head) {
		Node temp=head;
		while(temp!=null) {
			if(!temp.visited) {
				temp.visited=true;
				temp=temp.next;
				
			}
			else {
				return true;
			}
			
		}
		return false;
	}
	
	public void add(int data) {
		
		Node node=new Node(data);
		if(head==null) {
		head=node;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp+" ->");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		
		DetectLoopUsingFlag loop=new DetectLoopUsingFlag();
		loop.add(10);
		loop.add(20);
		loop.add(30);
		loop.add(40);
		loop.add(50);
		loop.display();
		Node temp=head;
		Node temp1=head;
		temp.next.next.next.next=temp1.next.next.next;
		boolean t = loop.detectLoop(head);
		System.out.println("\n\n\nLoop detected  "+t);
		//loop.display();
	}
}
