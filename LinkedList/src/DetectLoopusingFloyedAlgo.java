public class DetectLoopusingFloyedAlgo {

	static Node head=null;
	
	
	static class Node{
		
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public boolean detectLoop(Node head) {
		Node van=head;
		Node bmw=head;
		
		while(bmw!=null&&bmw.next!=null) {
			
			
			van=van.next;
			bmw=bmw.next.next;
			if(van==bmw) {
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
			System.out.print(temp.data+" ->");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		
		DetectLoopusingFloyedAlgo loop=new DetectLoopusingFloyedAlgo();
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
