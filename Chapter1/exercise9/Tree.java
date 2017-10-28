public class Tree{
  Node root;


  public class Node{
    Node left;
    Node right;
    String element;
    int occurance;

    Node(String element){
      this.element = element;
      occurance = 1;
    }
  }



// starnting method for our reccursion. Easier to do let a new Node be created with just a String as paramether.
  public void insert(String element){
    root = insert(element, root);
  }

// this is really the insert method. In thils execise, I am supposed to not create new node if the element has the same value, but
// intstead keep a count of the occurance.

  public Node insert(String element, Node n){
    if(n == null){
      return new Node(element);
    }
    // if the value of the node is same, we just add the counter of that nodes occurance
    //
    if(sameElement(n.element, element)){
      // System.out.println("Came here");
      n.occurance ++;
      //n = insert(element,n.left);
      return n;
    }
    // the node is not the same
    else{
      // elemnt is less that its parent, make it its child
      if(element.compareTo(n.element) < 0){
        n.left = insert(element, n.left);

      }
      else if(element.compareTo(n.element) > 0){
        n.right = insert(element, n.right);
      }
      else{
        ;;
      }
      return n;
    }

  }

// find the depth of the left subtree
  public int depthLeft(Node n){
    if(n == null){
      return 0;
    }
    else{
      int leftDepth = depthLeft(n.left);
      int rightDepth = depthLeft(n.right);

      if(leftDepth > rightDepth){
        return (leftDepth +  1);
      }
      else{
        return (rightDepth + 1);
      }
    }
  }

  public int depthRight(Node n){
    if(n == null){
      return 0;
    }
    else{

      int rightDepth = depthRight(n.right);
      int leftDepth = depthRight(n.left);

      if(leftDepth > rightDepth){
        return (leftDepth +  1);
      }
      else{
        return (rightDepth + 1);
      }
    }
  }

// same methods as before but now we need to order them on the occurace, not the
// value of the elements,


  // print the tree in Prefix order

  public void printTree(Node n){
    if(n == null){
      return;
    }
    System.out.println(n.element + " number : " + n.occurance);
    printTree(n.left);
    printTree(n.right);

  }


  public boolean sameElement(String old, String inserted){
    if(old.equalsIgnoreCase(inserted)){
      // System.out.println("hehehe");

      return true;
    }
    return false;
  }

}
