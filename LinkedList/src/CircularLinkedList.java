//Instead of Head, using tail pointer which will point to the last node
//Accessing the first node is also easy because of this
public class CircularLinkedList {


	Node tail=null;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
		
	}
	
	//insert at end
	public void insertAtEnd(int data) {
		Node node=new  Node(data);
		if(tail==null) {
			tail=node;
			//setting tail.next to tail which means it will point to itself
			// Note: in circular linked list there should not be any null
			tail.next=tail;
			return;
		}
		node.next=tail.next;
		tail.next=node;
		tail=node;
	}
	//insert at start
	public void insertAtStart(int data) {
		
		Node node=new Node(data);
		if(tail==null) {
			tail=node;
			//setting tail.next to tail which means it will point to itself
			// Note: in circular linked list there should not be any null
			tail.next=tail;
			return;
		}
		node.next=tail.next;
		tail.next=node;
		//the difference here is only tail is not getting changed
		
	}
	
	//delete from start
	public int deleteFromStart() {
		
		if(tail==null) {
			return -1;
		}
		//check for only one element
		if(tail.next==tail) {
			int x=tail.data;
			tail=null;
			return x;
		}
		Node temp=tail.next;
		int data=temp.data;
		tail.next=tail.next.next;
		temp=null;
		return data;
	}
	
	
	//delete from end
	public int deleteFromEnd() {
		
		if(tail==null) {
			return -1;
		}
		//If there is only one element
		if(tail.next==tail) {
			int data=tail.data;
			tail=null;
			return data;
		}
		
		Node temp=tail;
		while(temp.next!=tail)
		{
			temp=temp.next;
		}
		temp.next=tail.next;
		int data=tail.data;
		tail=null;
		tail=temp;
		
		return data;
	}
	
	
	//insert at given position
	//considering 1based indexing because if 0 comes as the position 
	//it will be considered as insert at start
	public void insertAtpos(int data,int pos) {
		Node node=new Node(data);
		if(tail==null) {
			tail=node;
		}
		
		Node temp=tail;
		if(tail==null) {
			tail=node;
			//setting tail.next to tail which means it will point to itself
			// Note: in circular linked list there should not be any null
			tail.next=tail;
			return;
		}
		//same as insert at start
		if(pos==0) {
			
			node.next=tail.next;
			tail.next=node;
			return;
		}
		//if the position comes more than linked list size
		// if size is 4 and pos comes 5 then it means tail should be set to new node
		//which is not handled in this code
		for(int i=0;i<pos-1;i++) {
			temp=temp.next;
		}
		node.next=temp.next;
		temp.next=node;
		
		
		
	}
	
	
	//delete from position
	public int deletefromPos(int pos) {
		
		if(tail==null) {
			return -1;
		}
		Node temp=tail;
		for(int i=0;i<pos-1;i++) {
			
			temp=temp.next;
			
		}
		int data=temp.next.data;
		if (temp.next == tail) {
			tail=temp;
		}
		temp.next = temp.next.next;
		
		return data;
	}
	
	//Display
	
	public void display() {
		if(tail==null) {
			System.out.println("list is empty");
			return;
		}
		Node temp=tail.next;
		System.out.println("\n\nprinting from head\n");

		do {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		while(temp!=tail.next);
	}
	//display the tail
	public void displayTail() {
		if(tail==null) {
			System.out.println("list is empty");
			return;
		}
		System.out.println("\n\ntail is "+tail.data);
	}
	
	//reverse the circular linked list
	public void reverse() {
		
		if(tail==null) {
			System.out.println("List is empty");
			return;
		}
		Node head=tail.next;
		Node cur=head;
		Node prev=null;
		Node nextp;
		while(prev!=tail) {
			nextp=cur.next;
			cur.next=prev;
			prev=cur;
			cur=nextp;
			
		}
		
		
		cur.next=prev;
		
		tail=cur;
		
		
	}
	
	public static void main(String[] args) {
		
		CircularLinkedList list=new CircularLinkedList();
		
		list.insertAtStart(1122);
		list.insertAtEnd(322);
		list.insertAtEnd(43);
		list.displayTail();
		list.display();
		list.insertAtpos(222, 2);
		list.display();
		list.deleteFromEnd();
		list.displayTail();
		list.display();
		System.out.println("\n\ncheck");
		list.deletefromPos(2);
		list.insertAtStart(12);
		list.insertAtEnd(32);
		list.display();
		list.displayTail();
		/*
		 * list.deleteFromStart(); list.deleteFromStart(); list.deleteFromStart();
		 * list.deleteFromStart();
		 */
		list.reverse();
		list.display();
		list.displayTail();
	}
}
