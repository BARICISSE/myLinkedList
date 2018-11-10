import java.util.*;

public class LinkedList {
	public Node head;

	/*
	 * addFirst addLast addAt(e,newNode)
	 *
	 */

	public void addFirst(Node newNode) {
		// System.out.println(" head " + head);
		newNode.next = head;
		head = newNode;

	}

	public void addLast(Node newNode) {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public void addAt(int position, Node newNode) {
		Node temp = head;
		int count = 1;
		while(count != position ) {
			count++;
			temp = temp.next;
			
		}
		Node var = temp.next;
		temp.next = newNode;
		newNode.next = var;
		
	}
	
	
	
	public String toString() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(head.data);
		Node temp = head;
		while (temp.next != null) {
			list.add(temp.next.data);
			temp = temp.next;
		}

		return list.toString();
	}
}
