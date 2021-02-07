import java.util.*;
public class Grades{
    private SuperArray grades;
    public Grades(int s){
      this.grades = new SuperArray(s);
    }
    public void gadd(int g){
      this.grades.add(g);
    }
    public void gadd(int i, int g){
      this.grades.add(i,g);
    }
    public void gremove(int i){
      this.grades.remove(i);
    }
    public String GtoString(){
      return this.grades.toString();
    }
    
    public void gset(int i,int n){
      this.grades.set(i,n);
    }
}
