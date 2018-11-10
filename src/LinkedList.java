import java.util.*;

public class LinkedList {
	public Node head;
	

/*
 * addFirst
 * addLast
 * addAt(e,newNode)
 *
 */
	
	public void addFirst(Node newNode) {
	//	System.out.println(" head " + head);
		 newNode.next = head;
		head = newNode;
		
	}
	
	public String toString(){
		 ArrayList<Integer> list = new ArrayList<>();
		 list.add(head.data);
		Node temp = head;
		 while(temp.next != null) {
			 list.add(temp.next.data);
			 temp = temp.next;
		 }
		 
		  return list.toString();
	  }
}
