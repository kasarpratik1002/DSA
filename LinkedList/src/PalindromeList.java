//Palindrome can be done using stack or any other method like first iterate and take o/p then reverse and check
// but using this method its better to do we can do it in O(1) + finding the mid element is quite easier here

public class PalindromeList {

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
		
		PalindromeList lst=new PalindromeList();
		Node node=new  Node(1);
		Node node1=new  Node(1);
		Node node2=new  Node(1);
		Node node3=new  Node(3);
		Node node4=new  Node(2);
		Node node5=new  Node(1);
		
		
		head=node;
		node.next=null;
		node1.next=null;
		node2.next=null;
		node3.next=null;
		node4.next=null;;
	    node5.next=null;
	    
	    Node temp=head;
	    while(temp!=null) {
	    	System.out.println(temp.data);
	    	temp=temp.next;
	    }
		
	    
	    
	    boolean check=checkPalindrome(head);
	    System.out.println(check);
	}



	private static boolean checkPalindrome(Node head) {

		//find the mid
		Node van=head;
		Node bmw=head;
		
		while(bmw!=null&&bmw.next!=null) {
			van=van.next;
			bmw=bmw.next.next;
		}
		//reverse the half list
		Node start1=reverse(van);
		Node start=head;
		
		while(start1!=null) {
			if(start.data!=start1.data) {
				return false;
			}
			start=start.next;
			start1=start1.next;
			
		}
		return true;
	}



	private static PalindromeList.Node reverse(Node van) {

		
		if(van==null) {
			return null;
		}
		
		Node cur=van;
		Node prev=null;
		Node temp=null;
		while(cur!=null) {
			
			temp=cur.next;
			cur.next=prev;
			prev=cur;
			cur=temp;
		}
		return prev;
	}
}
