a)

/*
* Returns the smallest Node in a binary tree, Search tree or not.
* Using a global smallest Node in the tree which is updated
* I should test this method in my bst from week 1
*/

Node smallestInTree;

public Node findMin(Node n){
  if(n == null){
    return null;
  }
  Node smallestLeft = findMin(n.leftChild);
  Node smallestRight = findMin(n.rightChild);

  if(smallestLeft.data < smallestInTree.data){
    smallestInTree = smallestLeft;
  }
  if(smallestRight.data < smallestInTree.data){
    smallestInTree = smallestRight;
  }
  return smallestInTree;
}

b)

/*
* Returns the largest Node in a binary tree, Search tree or not.
* Using a global largest Node in the tree which is updated
* I should test this method in my bst from week 1
*/

Node largestInTree;

public Node findMin(Node n){
  if(n == null){
    return null;
  }
  Node largestLeft = findMin(n.leftChild);
  Node largestRight = findMin(n.rightChild);

  if(largestLeft.data < largestInTree.data){
    largestInTree = largestLeft;
  }
  if(largestRight.data < largestInTree.data){
    largestInTree = largestRight;
  }
  return largestInTree;
}


c)

/*
* Returns the longest path to a Null node in the tree.
*/

public int longestPath(Node n){
  if(n == null){
    return 0;
  }
  else{
    int leftDepth = longestPath(n.leftChild);
    int rightDepth = longestPath(n.rightChild);

    if(leftDepth > rightDepth){
      return (leftDepth + 1);
    }else{
      return (rightDepth + 1);
    }
  }
}

/*
* Returns the shortest path to a Null node in the tree.
*/

public int shortestPath(Node n){
  if(n == null){
    return 0;
  }
  int leftShortest = shortestPath(n.leftChild);
  int rightShortest = shortestPath(n.right);

  if(leftShortest < rightShortest){
    return(leftShortest + 1);
  } else{
    return(rightShortest + 1);
  }
}
