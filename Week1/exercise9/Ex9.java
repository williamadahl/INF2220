import java.io.*;
import java.util.*;

// might want to finish this later
class Ex9{

  public static void main(String[] args) {

      Tree tree = new Tree();
      Scanner sc;
    //  ArrayList<Node> list = new ArrayList<Node>();


      try{
        sc = new Scanner(new File("Vildanden.txt"));
      } catch (FileNotFoundException e){
        return;
      }
      while(sc.hasNext()){
        String [] elements = sc.next().split("\\W+");
        for(int i = 0 ; i < elements.length; i++){
          tree.insert(elements[i],1);
        }
      }

      //
      // tree.insert("d");
      // tree.insert("b");
      // tree.insert("c");
      // tree.insert("a");
      // tree.insert("f");
      // tree.insert("a");
      // tree.insert("A");
      // tree.insert("a");
      // tree.insert("a");
      // tree.insert("g");
      // tree.insert("b");
      // tree.insert("B");
      // tree.insert("h");
      // tree.insert("e");


      System.out.println("Depth left : " + tree.depthLeft(tree.root.left));
      System.out.println("Depth right : " + tree.depthRight(tree.root.right));

      Tree occuranceTree = new Tree();

      try{
        sc = new Scanner(new File("occurance.txt"));
      } catch (FileNotFoundException e){
        return;
      }
      while(sc.hasNext()){
        String element = sc.next();
        int count = Integer.parseInt(sc.next());
        occuranceTree.insertOccu(element,count);
      }

      System.out.println("Depth left : " + occuranceTree.depthLeft(occuranceTree.root.left));
      System.out.println("Depth right : " + occuranceTree.depthRight(occuranceTree.root.right));

/* EXERCISE 9
*  When reinserting the Strings based on their occurance in the new bst
* the tree is much more balanced. The original tree we had a left subtree of depth 18 and right subtree of depth 29.
* The new tree is balanced with 13 13 on each side. Great!
*/


  }

}
