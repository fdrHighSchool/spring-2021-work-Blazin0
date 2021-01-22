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
    for(int i =0; i <= arr.length-1;i++){
      if(arr[i] == 0){
        arr[i] = val;
      }
    }
  }
  public void add(int index, int val){
    this.arr[index] = val;
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
