import java.util.*;

public class SuperArray{
  private int[] arr;
  public SuperArray(){
    this.arr = new int[10];
   }
  public SuperArray(int s){
    this.arr = new int[s];
  }
  public void add(int val){
      grow(1);
      this.arr[arr.length-1] = val;
    }
  public void add(int index, int val){
    grow(1);
    this.arr[index-1] = val;
  }
  public void grow(int n){
    int[] newarray = new int[arr.length+n];
    for (int i =0; i < arr.length;i++){
      newarray[i] = arr[i];
    }
    this.arr = newarray;
  }
  public void set(int i, int val){
    this.arr[i-1] = val;
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
    int[] newarray = new int[this.arr.length-index];
    for(int i = 0;i < index;i++){
      newarray[i]= arr[i];
    }
    this.arr = newarray;
  }
  public String toString(){
    System.out.println(Arrays.toString(this.arr));
    return Arrays.toString(this.arr);
  }
}
