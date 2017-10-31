/*
  To implement a tree where each node may hava an arbitary amount of children we can
  let each node keep track of their first child and their next sibling
*/

class ex4{

  static Tree tree;

public static void main(String[] args) {

  tree = new Tree();
  System.out.println("test");

  tree.insert(7);
  tree.insert(6);
  tree.insert(5);
  System.out.println(tree.getRoot());
  System.out.println(tree.root.getfirstChild());

  }

}
