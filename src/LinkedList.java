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
	
	public void remove(Node newNode) {
		Node temp = head;
		while(temp.next.data != newNode.data) {
			temp = temp.next;
			
		}
		Node vqr = temp.next;
		temp.next = temp.next.next;
		vqr.next = null; 
	
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
	
	public void removeFirst() {
		if(head == null) return; 
		Node temp = head;
		head = head.next;
		temp.next = null;	
	}
	
	public void removeLast() {
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		
		
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
