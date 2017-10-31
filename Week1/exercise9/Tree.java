public class Tree{
  Node root;



  public class Node{
    Node left;
    Node right;
    String element;
    int occurance;

    Node(String element, int occurance){
      this.element = element;
      this.occurance = occurance;
    }
  }



// starnting method for our reccursion. Easier to do let a new Node be created with just a String as paramether.
  public void insert(String element, int occ){
    root = insert(element, occ ,root);
  }

// this is really the insert method. In thils execise, I am supposed to not create new node if the element has the same value, but
// intstead keep a count of the occurance.

  public Node insert(String element, int occ, Node n){
    if(n == null){
      return new Node(element, occ);
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
        n.left = insert(element,occ, n.left);

      }
      else if(element.compareTo(n.element) > 0){
        n.right = insert(element,occ, n.right);
      }
      else{
        ;;
      }
      return n;
    }

  }

  /* EXERCISE 9
  * starnting method for our reccursion. Easier to do let a new Node be created with just a String as paramether and the occurance
  */
    public void insertOccu(String element, int occ){
      root = insertOccu(element, occ ,root);
    }

  /* EXERCISE 9
  * This is really the insert method for the occurance tree.
  */

    public Node insertOccu(String element, int occ, Node n){
      if(n == null){
        return new Node(element, occ);
      }

      // elemnt is less that its parent, make it its child
      if(occ < n.occurance){
        n.left = insertOccu(element,occ, n.left);

      }
      else if(occ > n.occurance){
        n.right = insertOccu(element,occ, n.right);
      }
      else{
        ;;
      }
      return n;
    }


/*
* find the depth of the left subtree
*/

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



  /* print the tree in Prefix order
  * Used this method to make a new txt file with occurace of each word.
  * Make a new sorted tree sorted on occurace in stead
  */

  public void printTree(Node n){
    if(n == null){
      return;
    }
    System.out.println(n.element + " : " + n.occurance);
    printTree(n.left);
    printTree(n.right);

  }



  public boolean sameElement(String old, String inserted){
    if(old.equalsIgnoreCase(inserted)){
      return true;
    }
    return false;
  }


// Printing the root for debug purpose

  public void printRoot(){
    System.out.println("This is my root : " + root.element);
  }


}
