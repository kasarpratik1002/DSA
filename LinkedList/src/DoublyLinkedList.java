
public class DoublyLinkedList {

	Node head = null;

	static class Node {
		int data;
		Node next;
		Node prev;

		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}

		Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	// insert from front
	public void insertFront(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
			return;
		}
		node.next = head;
		head.prev = node;
		head = node;
	}

	// insert from end

	public void insertEnd(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
		node.prev = temp;

	}

	// insert at given position

	public void insertAtPos(int data, int pos) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
			return;
		}

		Node temp = head;
		int i = 0;
		while (i < pos - 1) {
			temp = temp.next;
			i++;
		}
		// if position is 0
		if (pos == 0) {
			node.next = temp;
			temp.prev = node;
			head = node;
		}
		node.next = temp.next;
		temp.next = node;
		node.prev = temp;
		if (node.next != null) {
			node.next.prev = node;
		}

	}

	public int deletefromPos(int pos) {

		if (head == null) {
			return -1;

		}
		/*
		 * if(head.next==null) { Node temp=head; head=null; return temp.data; }
		 */
		Node temp = head;

		int i = 0;
		while (i < pos) {
			temp = temp.next;
			i++;
		}
		// if position is 0 then head needs to move forward
		if (temp == head) {

			int data = temp.data;
			head = head.next;
			head.prev = null;
			temp = null;
			return data;
		}

		temp.prev.next = temp.next;
		if (temp.next != null) {
			temp.next.prev = temp.prev;
		}
		int data = temp.data;
		temp = null;
		return data;

	}

	// delete from front
	public int deleteFromFront() {
		if (head == null) {
			return -1;
		}
		int data = head.data;
		head = head.next;
		// Make previous of head always to null otherwise it would be pointing to
		// garbage value
		if (head != null) {
			head.prev = null;
		}
		return data;
	}

	public int deletefromEnd() {

		if (head == null) {
			return -1;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		// this condition is for If there is only single node in the list and which is
		// head then
		// prev of head will be null
		if (temp == head) {
			head = null;
			return temp.data;
		}
		int data = temp.data;
		temp.prev.next = null;
		temp = null;
		return data;

	}

	public void printlist() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " <- -> ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		DoublyLinkedList list = new DoublyLinkedList();
		list.insertFront(12);
		list.printlist();

		list.insertEnd(43);
		list.insertEnd(77);
		list.printlist();
		// System.out.println(list.deleteFromFront());
		// System.out.println(list.deleteFromFront());
		// System.out.println(list.deletefromEnd());
		// System.out.println(list.deletefromEnd());
		list.insertAtPos(111, 0);
		list.insertAtPos(222, 1);
		list.deletefromPos(0);
		list.deletefromPos(2);
		list.printlist();
	}
}
