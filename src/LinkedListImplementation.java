
public class LinkedListImplementation {
	
  public static void main(String[] args) {
    Node n = new Node();
    n.data = 6;
    Node newNode = new Node();
    newNode.data = 7;
    n.next = newNode;
   // System.out.println(n.toString());
    
    
    LinkedList myList = new LinkedList();
    
    myList.head = n;
    
    System.out.println(" old list " + myList.toString());
    
    
    
    Node newNode1 = new Node();
    newNode1.data = 5;
   myList.addFirst(newNode1);
   System.out.println(" new list " +  myList.toString());
    
  }

}
