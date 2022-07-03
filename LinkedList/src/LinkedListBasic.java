//Linkedlist basic code
//1.insert at head
//2. insert at end
//3. insert at given position
//4. delete from front
//5. delete from given position
//6. delete from end
//7. search
//8. print
//9. reverse

public class LinkedListBasic {

	Node head=null;
	//Create a static class 
	static class Node{
		
		private int data;
		private Node next;
		Node(int data){
			
			this.data=data;
			this.next=null;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
		
		
		
	}
	//add front
	public void addFront(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			node.next=head;
			head=node;
		}
	}
	//add last
	public void addLast(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=node;
		}
		
	}
	//add at position
	public void addAtPos(int data,int pos) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
		}else {
			Node temp=head;
			int i=0;
			while(i<pos-1) {
				temp=temp.next;
			
				i++;
			}
			node.next=temp.next;
			temp.next=node;
			
		}
	}
	
	
	//delete the front
	public int deleteFront() {
		
		if(head==null) {
			return -1;
		}
		else {
			int data=head.data;
			head.data=Integer.MIN_VALUE;
			head=head.next;
			
			return data;
		}
	}
	
	//delete from last
	
	public int deleteFromLast() {
		
		if(head==null) {
			return -1;
		}else{
		Node temp=head;
		Node temp1=head.next;
		while(temp1.next!=null) {
			temp=temp.next;
			temp1=temp1.next;
		}
		int data=temp1.data;
		temp.next=null;
		return data;
		}
	}
	
	
	//Delete from position
	
	public int deletefromPos(int pos) {
		
		if(head==null) {
			return -1;
		}else{
			Node temp=head;
			Node temp1=head.next;
			int i=0;
			while(i<pos-1) {
				temp=temp.next;
				temp1=temp1.next;
				i++;
			}
			int data=temp1.data;
			temp.next=temp1.next;
			temp1.next=null;
			return data;
		}
	}
	
	//linear search
	public int search(int data) {
		int index=0;
		if(head==null) {
			return -1;
		}else{
			Node temp=head;
			while(temp!=null) {
				if(temp.data==data) {
					return index; 
				}
				temp=temp.next;
				index++;
			}
			return -1;
		}
	}
	
	
	//Reverse the list
	/*
	public void reverse() {
		
		if(head==null) {
			return;
		}
		else {
			
		}
	}
	*/
	public void display() {
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-> ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		
		LinkedListBasic basic=new LinkedListBasic();
		basic.addFront(12);
		basic.addFront(13);
		basic.addFront(114);
		
		basic.display();
		
		
		basic.addLast(232);
		basic.addLast(233);
		basic.addLast(234);
		System.out.println("\n\n");
		
		basic.display();
		
		basic.addAtPos(25, 2);
		System.out.println("\n\n");
		
		basic.display();
		
		System.out.println("\ndelete from front");
		System.out.println("data deleted is "+basic.deleteFront());
		basic.display();
		
		System.out.println("delete from end");
		System.out.println(basic.deleteFromLast()+"\n\n\n"); 
		basic.display();
		
		System.out.println("\nDelete from position");
		basic.deletefromPos(2);
		System.out.println();
		basic.display();
		System.out.println("Search");
		System.out.println("Element found at index "+basic.search(2323));
	}
}
