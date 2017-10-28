public class TreeF{
  NodeF rootF;


  private class NodeF{
    NodeF left;
    NodeF right;
    String element;
    int occurance;

    NodeF(String element, int occurance){
      this.element = element;
      this.occurance = occurance;
    }
  }

  public void frequencyInsert(String element , int occurance){
      rootF = frequencyInsert(element, occurance, rootF);
  }

  public NodeF frequencyInsert(String element,int occurance,  NodeF n){
    if(n == null){
      return new NodeF(element, occurance);
    }

    if(occurance < n.occurance){
      n.left = frequencyInsert(element,occurance, n.left);
    }
    else if(occurance > n.occurance){
      n.right = frequencyInsert(element, occurance, n.right);
    }
    else{
      ;;
    }
    return n;
  }
}
