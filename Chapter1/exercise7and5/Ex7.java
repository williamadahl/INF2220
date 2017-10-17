class Ex7{

  public static void main(String[] args) {

    Tree tree = new Tree();
    tree.insert(6);
    tree.insert(8);
    tree.insert(2);
    tree.insert(1);
    tree.insert(5);
    tree.insert(3);
    tree.insert(4);

    System.out.println("Total nodes: " + tree.number());

    if(tree.contains(3)){
      System.out.println("found element");
    }
    else{
      System.out.println("element not in tree");
    }

  //  System.out.println(tree.findMin());

    tree.remove(2);
    System.out.println("Total nodes: " +  tree.number());
    System.out.println("Total tree value: " +  tree.total());

  }
}
