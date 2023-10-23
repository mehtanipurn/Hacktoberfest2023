public class LinkedList {

  private Node top;

  private static class Node {
    private int value;
    private Node next;

    Node(int value) {
      this.value = value;
    }
  }
  
  private void addToEnd(Node n){
    if(top == null)
      top = n;
    else{
      Node temp = top;
      while(temp.next != null)
        temp = temp.next;
      temp.next = n;
    }
    
  }

  public static void main(String[] args) {

    LinkedList list = new LinkedList();
    
    Node top = new Node(30);
    list.addToEnd(top);
    list.addToEnd(new Node(10));
    list.addToEnd(new Node(5));
    list.addToEnd(new Node(23));
    list.addToEnd(new Node(20));
    
    System.out.println("Printing nodes in current order");
    
    list.printList(top);
    
    System.out.println("\n\nPrinting nodes in reverse order");
    
    Node n = list.reverse(top);
                list.printList(n);
    
  }
  
  public void printList(Node top){
    while(top != null){
      System.out.printf("%d ", top.value);
      top = top.next;
    }
  }

  //reverse using Recursion
  private Node reverse(Node head) {
    if(head==null || head.next == null)
      return head;
    Node p = reverse(head.next);
    head.next.next = head;//n+1 th node pointing nth node
    head.next = null; 
    return p;
  }
  
}
