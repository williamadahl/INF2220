import java.util.Arrays;

/* a bubble sort algorithm
  uses nested loops and is therefore not very efficient.
  It runs in O(n^2)
*/

class bubblesort{

  public static void main(String[] args) {
    int [] list = {5, 7, 4, 0, 4, 1};
    System.out.println(Arrays.toString(list));

    sort(list);
    System.out.println("Elementh in :" + 3 + "th position is : " + list[2]);

  }



  public static int[] sort(int[] list){
    int i, j, temp = 0;

    for(i = 0; i < list.length -1 ; i++){
      for(j = 0; j < list.length - 1 - i; j++){
        if (list[j] > list[j+1]){
          temp = list[j];
          list[j] = list[j+1];
          list[j+1] = temp;
        }
      }
      System.out.println(Arrays.toString(list));
    }
    return list;
  }
}
