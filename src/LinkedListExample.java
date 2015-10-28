

public class LinkedListExample
{
	public static void main(String[] args) {
		int[] array = {1,2,3,5,7,4,2,5};
		LinkedList ll = new LinkedList(array[0]);
		
		for(int i = 1; i < array.length; i++) {
			Node temp = new Node(array[i], null);
			ll.insert(temp);
		}
		
		System.out.print("Print LL: ");
		ll.printLinkedList();

		Node rm = null;
		rm = ll.remove(array[3]);
		System.out.println("Remove " + array[3]);
		System.out.print("Print LL: ");
		ll.printLinkedList();
		
		Node mid = findMid(ll.getHead());
		System.out.println("Mid: "+ mid.data);
		
		// Make loop
		//makeLoop(ll.getHead());
		//ll.printLinkedList();
		System.out.println("This ll has a loop ?" + haveLoop(ll.getHead()));
		
		System.out.println("Third Node from the end: " + thirdNode(ll.getHead()).data);
	}
	
	public static Node findMid(Node head) {
		if(head == null)
			return null;
		Node ahead = head;
		Node mid = head;
		int count = 0;
		while(ahead != null) {
			ahead = ahead.next;
			count++;
			if(count == 2) {
				mid = mid.next;
				count = 0;
			}
		}
		
		return mid;
	}
	
	public static void makeLoop(Node head){
		Node tmp = head;
		while(head.next != null){
			head = head.next;
		}
		head.next = tmp;
	}
	
	public static boolean haveLoop(Node head){
		Node a = head;
		Node b = head;
		while(a != null) {
			a = a.next;
			if (a == b) {
				return true;
			}
		}
		return false;
	}
	
	public static Node thirdNode(Node head){
		Node result = null;
		Node temp = head;
		int count = 1;
		while(temp.next != null){
			if(count == 3){
				result = head;
				temp = temp.next;
				result = result.next;
			} else if(count < 3){
				temp = temp.next;
			} else {
				temp = temp.next;
				result = result.next;
			}
			count++;
		}
		return result;
	}
}