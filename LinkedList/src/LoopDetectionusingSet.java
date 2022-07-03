import java.util.HashSet;
import java.util.Set;

public class LoopDetectionusingSet {

	static Node head=null;
	
	
	static class Node{
		
		int data;
		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public boolean detectLoop(Node head) {
		Set<Node> set=new HashSet<>();
		Node temp=head;
		while(temp!=null) {
			if(set.contains(temp))
			{
				return true;
			}
			set.add(temp);
			temp=temp.next;
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
		
		LoopDetectionusingSet loop=new LoopDetectionusingSet();
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
