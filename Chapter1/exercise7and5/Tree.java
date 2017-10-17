public class Tree{

  Node root;
  int totalNodes;
  int totalValue;

  private class Node{
    Node right;
    Node left;
    int value;

    Node(int value){
      this.value = value;
    }
  }


// a) method for inserting in the BST

  public void insert(int value){
     root = insert(value, root);
  }

  public Node insert(int value, Node n){
    //basecase
    if(n == null){
      return new Node(value);
    }
    //hvis verdien vi vil sette inn er lavere enn parent, skaal den bli dens venstre barn
    if(value < n.value){
      n.left = insert(value, n.left);
    }
    else if(value > n.value){
      n.right = insert(value, n.right);
    }
    else{
      ;;
    }
    return n;
  }

// b) method for searching for an element in the tree

    public boolean contains(int value){
      return contains(value, root);
    }

    public boolean contains(int value, Node n){
      //basecase, fant ingen noder med den verdien, eller har ingen root node
      if(n == null){
        return false;
      }
      if(value < n.value){
        return contains(value, n.left);
      }
      else if(value > n.value){
        return contains(value, n.right);
      }
      else{
        return true;
      }
    }

// c) method for finding minimum. We can just go left while node is not null, becasue
//    the smallest element will be at the far right

  public int findMin(){
    return findMin(root);
  }

  public int findMin(Node n){
    if (n != null){
      while(n.left != null){
        n = n.left;
      }
    }
    return n.value;
  }

  // // helping method for our delete in d)
  //
  // public int findMax(){
  //   return findMax(root);
  // }
  //
  // public int findMax(Node n){
  //   if(n != null){
  //     while(n.right != null){
  //       n = n.right;
  //     }
  //   }
  //   return n;
  // }


  // d) removing a value from the tree
  //    starting the recursive call at root

  public void remove(int value){
    remove(value, root);
  }

  public Node remove(int value, Node n){

    if(n == null){
      return n;                                      // intem is not found and we do nothing
    }
    // value is less than parent, call down the left subtree
    else if(value < n.value){
      n.left = remove(value, n.left);
    }
    else if(value > n.value){
      n.right = remove(value, n.right);
    }
    // Now we have found the node to be deleted. We now have 3 cases.
    // I   : no child of node.
    // II  : one child
    // III : two childs
    else{
      // case III
      // replace the data of this node with the smallest data of the right subtree
      // then recursively delete that node.

      if(n.left != null && n.right != null){
        int minRight = findMin(n.right);           // find the smallest in the right subtree
        n.value = minRight;                         // replace the data in the node we wanted to remove
        n.right = remove(n.value, n.right);         // remove the smallest node in the right subtree, this node will have only one child
      }
      // case II : right child
      else if(n.right != null){
        Node tmp = n.right;                          // get the right child
        n.value = tmp.value;                          // set that value into the node we want to delete
        n.right = null;                               // set the child to null
      }
      // case II : left child
      else if(n.left != null){
        Node tmp = n.left;                            // get the left child
        n.value = tmp.value;                          // set that value into the node we want to delete
        n.left = null;                                // set that child to null
      }
      // case I now all we neen to do is to to sett this node to null
      else{
        n = null;
      }
    }
    return n;

  }


    //ex 5 a ) : returns the amount of nodes in the tree, it does not matter what traversal we do, but i chose preorder
    public int number(){
      totalNodes = 0;         //setting ammount of nodes to 0, so we can call it again
      return number(root);
    }

    public int number(Node n){
      if(n == null){
        return totalNodes;
      }
      System.out.println(n.value);
      number(n.left);
      number(n.right);
      totalNodes++;   //after the recursive calls, add upp totalNodes

      return totalNodes;
    }



    // ex 5 b) getting the total value of the tree

    public int total(){
      totalValue = 0;         //setting ammount of nodes to 0, so we can call it again
      return total(root);
    }

    public int total(Node n){
      if(n == null){
        return totalValue;
      }

      total(n.left);
      total(n.right);
      totalValue += n.value;

      return totalValue;
    }


}
