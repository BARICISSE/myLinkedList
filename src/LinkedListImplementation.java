
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
    
  //  System.out.println(" old list " + myList.toString());
    
    
    
    Node newNode1 = new Node();
    newNode1.data = 4;
   myList.addFirst(newNode1);
  // System.out.println(" old list " +  myList.toString());
    
   
   Node newNode2 = new Node();
   newNode2.data = 9;
   myList.addLast(newNode2);
  // System.out.println(" old list " +  myList.toString());
   
   
   Node newNode3 = new Node();
   newNode3.data = 8;
   myList.addAt(3, newNode3);
  // System.out.println(" new list " +  myList.toString());
   
   Node newNode4 = new Node();
   newNode4.data = 5;
   myList.addAt(1, newNode4);
   System.out.println(" last list " +  myList.toString()); 
   
   //test removeFirst
   myList.removeFirst();
   System.out.println(" new list " +  myList.toString()); 

   

  }

}
