class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> T getNodeValue(Node<T> head, int index) {
    // todo - note the return type, but don't overthink it
    // initialze pointer to head, null T obj, and counter variables
    Node<T> curr = head;
    T result = null;
    int i = 0;

    // iterate through LL and return the val as generic type if index matches counter
    while (curr != null) {
      if (i == index) {
        result = curr.val;
      }
      // move pointer and increment counter
      curr = curr.next;
      i++;
    }
    return result;
  }
  
  public static void main(String[] args) {
    Node<String> node1 = new Node<>("banana");
    Node<String> node2 = new Node<>("mango");
    Node<String> node3 = new Node<>("kiwi");

    node1.next = node2;
    node2.next = node3;

    // banana -> mango -> kiwi

    System.out.println(ECSource.getNodeValue(node1, 1));

    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    
    a.next = b;
    b.next = c;
    c.next = d;

    System.out.println(ECSource.getNodeValue(a, 7));

  }
}