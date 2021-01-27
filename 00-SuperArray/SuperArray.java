import java.util.*;

public class SuperArray{
  private boolean bool;
  private int[] arr;
  private int index;

  // public SuperArray(){
  //   this.arr = new int[10];
  //   this.index = 0;
  //
  // }
  public SuperArray(int s){
    this.arr = new int[s];
  }

  public void add(int val){
    int[] arrayadd1 = new int[arr.length+1];
    for(int i =0; i < arr.length-1;i++){
      arrayadd1[i] = arr[i];
      }
      arrayadd1[arr.length] = val;
      this.arr = arrayadd1;
    }

  public void add(int index, int val){
    int[] arrayadd2 = new int[arr.length+1];
    for(int i = 0; i < arr.length ; i++){
      arrayadd2[i] = arr[i];
    }
    arrayadd2[index-1] = val;
    this.arr = arrayadd2;
  }
  public void grow(int n){

  }
  public void set(int i, int val){

  }
  public boolean isEmpty(){
    int sum = 0;
    for(int i = 0; i <= arr.length-1;i++){
       sum += this.arr[i];
     }
     if(sum == 0){
       System.out.println("true");
       return true;
     }

     System.out.println("false");
     return false;
   }

  public void remove(int index){
  }

  public String toString(){
    System.out.println(Arrays.toString(this.arr));
    return Arrays.toString(this.arr);
  }
}
