import java.util.*;
class Main {
  public static void main(String[] args) {
  int[][] arr = new int[5][10];
  arr[2][1] = 5;
  arr[1][1] = 3;
  System.out.println(Arrays.toString(getColumn(arr,1)));
  }
  public static int[] getColumn(int[][] arr2D, int c){
    int[] temparr = new int[arr2D.length];
    for(int i = 0; i < arr2D.length; i++){
      temparr[i] = arr2D[i][c];
    }
    return temparr;
  }
 public static boolean isLatin( int [][] square){
   if(containsDuplicates(square[0]) == false){
     for(int i = 0;i < square.length; i++){
       if(!hasAllvalues(square[0],square[i]){
         return false;
       }
     }
      return true;
   }
   return false;
 }
}
