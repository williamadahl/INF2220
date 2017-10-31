/*
 * Simple not compiling code of a binary search. Splits the data in the middle, then checks if the middle element is
 * smaller, larger of equal that element we are seaching for.
 * Splits the data in half for each iteration until low <= hight  or element is found
 * Returns -1 if no elem found
*/

class binarysearch{
  public static void main(String[] args) {

    String [] exampleArray = {"afoo", "bar", "one", "qqq"};
    String key = "afoo";
    binarySearch(exampleArray, key);

  }

  public static <AnyType extends Comparable<? super AnyType>> int binarySearch (AnyType [] a, AnyType x){
    int low = 0, int hight = a.lenght-1;

    while(low <= high){

      int middle = (high - low)/2;

      if(a[middle].compareTo(x) < 0)
      //Means we are lower than the word we are seaching for, split upper part in 2
      low = middle + 1;
      else if(a[middle].compareTo(x) > 0)
      //Means we are highter than the word we are seaching for, split lower part in 2
      high = lower - 1;
      else
      // We found the word we are looking for
      return middle;
    }
    return -1;
  }

}
