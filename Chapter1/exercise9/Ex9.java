import java.io.*;
import java.util.*;

// might want to finish this later
class Ex9{

  public static void main(String[] args) {

      Tree tree = new Tree();
      Scanner sc;
      ArrayList<Node> list = new ArrayList<Node>();


      // try{
      //   sc = new Scanner(new File("Vildanden.txt"));
      // } catch (FileNotFoundException e){
      //   return;
      // }
      // while(sc.hasNext()){
      //   String [] elements = sc.next().split("\\W+");
      //   for(int i = 0 ; i < elements.length; i++){
      //     tree.insert(elements[i]);
      //   }
      // }


      tree.insert("d");
      tree.insert("b");
      tree.insert("c");
      tree.insert("a");
      tree.insert("f");
      tree.insert("a");
      tree.insert("A");
      tree.insert("a");
      tree.insert("a");
      tree.insert("g");
      tree.insert("b");
      tree.insert("B");

      TreeF ftree = new TreeF();


      tree.printTree(tree.root);


  }
}
