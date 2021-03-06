package com.recursion.basic;

public class printLinkedList {
	
	
	static Node head=null;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public static void main(String[] args) {

		Node node=new Node(12);

		Node node1=new Node(13);

		Node node2=new Node(14);

		Node node3=new Node(15);

		Node node4=new Node(16);
		
		node4.next=null;
		node.next=node1;
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		
		head=node;
		Node temp=head;
		printList(temp);
		
		Node reverseList = reverseList(head,null);
		System.out.println();
		printList(reverseList);
	}

	private static Node reverseList(Node head,Node prev) {

		if(head==null) {
			return prev;
		}
		Node temp=head.next;
		
		head.next=prev;
		prev=head;
		head=temp;
		return reverseList(head,prev);


	}

	private static void printList(Node head2) {

		if(head2==null) {
			return;
		}
		System.out.println(head2.data);
		printList(head2.next);
	}

}
