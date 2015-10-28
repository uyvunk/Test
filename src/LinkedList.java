

public class LinkedList
{
	Node head;
	
	public LinkedList(int d) {
		Node current = new Node(d,null);
		head = current;
	}

	public Node getHead() {
		return head;
	}

	public void insert(Node n) {
		n.next = head;
		head = n;
	}

	public Node remove(int data) {
		Node current = head;
		if(current.data == data) {
			Node temp = head;
			head = head.next;
			return temp;
		} else {
			while(current != null) {
				if(current.next.data == data) {
					Node temp = current.next;
					current.next = current.next.next;
					return temp;
				}
				current = current.next;				
			}
			return null;
		}
	}

	public void printLinkedList() {
		Node current = head;
		while(current != null) {
			System.out.print("|"+current.data+"|->");
			current = current.next;
		}
		System.out.println();
	}
}