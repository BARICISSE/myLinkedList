
public class LinkedListImplementation {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Node n = new Node();
    n.data = 6;
    Node newNode = new Node();
    newNode.data = 7;
    n.next = newNode;
    System.out.println(n.toString());
  }

}
