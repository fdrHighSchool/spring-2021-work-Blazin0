public class Driver{
  public static void main(String[] args){
    SuperArray arr1 = new SuperArray(9);// -1 since arrays have 0
    SuperArray arr2 = new SuperArray(12);
    SuperArray arr3 = new SuperArray(4);
      arr1.add(1,20);
      arr2.add(20);
      arr1.set(2,10);
      arr1.toString();
      arr1.isEmpty();
      arr2.toString();
      arr3.isEmpty();
      arr3.grow(5);
      arr3.toString();
      arr1.grow(9);
      arr1.toString();
  }
}
