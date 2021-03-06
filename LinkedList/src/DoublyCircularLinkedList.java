
public class DoublyCircularLinkedList {

	Node tail = null;

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

	// insert at start
	public void insertAtStart(int data) {
		Node node = new Node(data);
		if (tail == null) {
			tail = node;
			// making it circular linked list
			tail.next = tail;
			tail.prev = tail;
			return;
		}

		node.next = tail.next;
		tail.next = node;
		node.next.prev = node;
		node.prev = tail;

	}

	// insert at End
	public void insertAtend(int data) {
		Node node = new Node(data);
		if (tail == null) {
			tail = node;
			// making it circular linkedlist
			tail.next = tail;
			tail.prev = tail;
		}

		node.next = tail.next;
		tail.next = node;
		node.next.prev = node;
		node.prev = tail;
		tail = node;
	}

	// insert at given position

	public void insertAtpos(int data, int pos) {
		Node node = new Node(data);
		if (tail == null) {
			tail = node;
			tail.next = tail;
			tail.prev = tail;
			return;
		}

		Node temp = tail;

		for (int i = 0; i < pos - 1; i++) {
			temp = temp.next;
		}
		node.next = temp.next;
		temp.next = node;
		node.next.prev = node;
		node.prev = temp;
		if (temp == tail) {
			tail = node;
		}
	}

	// delete from position
	public int deletefromPos(int pos) {
		int data = -1;
		if (tail == null) {
			return data;
		}

		Node temp = tail;
		for (int i = 0; i < pos; i++) {
			temp = temp.next;
		}
		if (tail.next == tail && tail.prev == tail) {
			data = tail.data;
			tail = null;
			return data;
		}
		data = temp.data;
		temp.prev.next = temp.next;
		temp.next.prev = temp.prev;
		if (temp == tail) {
			tail = temp.prev;
		}
		return data;
	}

	// delete from start
	public int deleteStart() {
		int data = -1;
		if (tail == null) {
			System.out.println("list is null");
			return data;
		}
		// if there is only one element left
		if (tail.next == tail) {
			data = tail.data;
			tail = null;
			return data;
		}

		data = tail.next.data;
		tail.next = tail.next.next;
		tail.next.prev = tail;
		return data;

	}

	// delete from tail

	public int deletefromEnd() {
		int data = -1;
		if (tail == null) {
			System.out.println("list is empty");
			return data;
		}
		if (tail.next == tail) {
			data = tail.data;
			tail = null;
			return data;
		}

		data = tail.data;
		tail.prev.next = tail.next;
		tail.next.prev = tail.prev;
		tail = tail.prev;
		return data;

	}

	public void display() {
		if (tail == null) {
			System.out.println("Empty list");
			return;
		}
		Node head = tail.next;
		Node temp = head;
		do {
			System.out.print(temp.data + " -> ");

			temp = temp.next;
		} while (temp != head);
		System.out.println();
	}

	public void printTail() {
		if (tail == null) {
			System.err.println("List is empty");
			return;
		}
		System.out.println("The tail is " + tail.data + "\n");
	}

	public void reverse() {
		if (tail == null) {
			System.out.println("List is empty");
			return;
		}

		Node head = tail.next;
		if (head == tail & tail.prev == tail) {
			System.out.println("list is alreay reversed:: only one element in the list");
			return;
		}

		Node cur = head;
		Node prev = null;
		Node nextp = null;

		while (prev != tail) {
			nextp = cur.next;
			cur.next = prev;
			cur.prev = nextp;
			prev = cur;
			cur = nextp;
		}
		cur.next = prev;
		tail = cur;

	}

	public static void main(String[] args) {

		DoublyCircularLinkedList list = new DoublyCircularLinkedList();
		list.insertAtStart(12);
		list.insertAtStart(122);
		list.insertAtStart(43);
		list.insertAtStart(54);
		list.insertAtend(4333);
		list.insertAtend(987);

		list.display();
		System.out.println();
		list.deleteStart();
		list.deleteStart();
		list.display();
		System.out.println();
		list.display();
		list.printTail();
		System.out.println();
		list.deletefromPos(4);
		list.insertAtpos(11, 1);
		list.insertAtpos(121, 5);
		list.display();
		System.out.println("\n the reverse");
		list.reverse();
		list.display();
		list.printTail();
	}
}
