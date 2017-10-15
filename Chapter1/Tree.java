public class Tree{

  Node root;
  int totalValue;

  public class Node{


    int element;
    Node firstChild;
    Node nextSibling;

    public Node(int i){
      element = i;
      firstChild = null; nextSibling = null;
    }

    public Node(int i, Node f, Node sib){
      element = i;
      firstChild = f;
      nextSibling = sib;
    }
  }

  public Tree (){
    root = null;
    totalValue = 0;
  }

  public void insert(int i){
    root = insert(i, root);

  }
  public Node insert(int i, Node n){
    if (n == null){
      return new Node(i, null, null);
    }
    return n;

  }
  public int getRoot(){
    return root.element;
  }

  public int getfirstChild(Node n){
    return n.firstChild.element;
  }


}
