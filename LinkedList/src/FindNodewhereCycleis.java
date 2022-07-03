
public class FindNodewhereCycleis {

	static Node head=null;
	
	
	static class Node{
		
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public Node detectLoop(Node head) {
		Node van=head;
		Node bmw=head;
		
		while(bmw!=null&&bmw.next!=null) {
			
			
			van=van.next;
			bmw=bmw.next.next;
			if(van==bmw) {
				return van;
			}
		}
		return null;
	}
	
	public Node getPointWhereCycleStarts(Node van) {
		
		Node auto=head;
		while(van!=auto) {
			auto=auto.next;
			van=van.next;
			
		}
		return auto;
	}
	
	
	public void removeCycle(FindNodewhereCycleis.Node auto) {
		
		Node bike=auto;
		while(bike.next!=auto) {
			bike=bike.next;
		}
		bike.next=null;
		
		System.out.println("Cycle is removed ");
		
		display();
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
			System.out.print(temp.data+" ->");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		
		FindNodewhereCycleis loop=new FindNodewhereCycleis();
		loop.add(10);
		loop.add(20);
		loop.add(30);
		loop.add(40);
		loop.add(50);
		loop.display();
		Node temp=head;
		Node temp1=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=temp1.next.next;

		Node t = loop.detectLoop(head);
		System.out.println("\n\n\nLoop detected  "+t.data);
		
		Node pointWhereCycleStarts = loop.getPointWhereCycleStarts(t);
		System.out.println("Loop is starting from "+ pointWhereCycleStarts.data);
		loop.removeCycle(pointWhereCycleStarts);
		 t = loop.detectLoop(head);
		System.out.println("\n\n"+t);
		//loop.display();
	}
}
