import java.util.*;
public class Point{
  private int x;
  private int y;
  public Point(int x , int y){
    setLocation(x,y);
  }
  public Point(){
    this.x = 0;
    this.y = 0;
  }
  public void setLocation(int x ,int y){
    this.x = x;
    this.y = y;
  }
  public int getX(){
    return this.x;
  }
  public int getY(){
    return this.y;
  }
  public double distanceFromOrigin(){
    return Math.sqrt(this.x * this.x + this.y * this.y);
  }

public void translate(int x2,int y2){
  setLocation(this.x + x2, this.y + y2);
}
public double distance(Point point){
  return Math.sqrt(Math.pow(this.x - point.getX(), 2) + Math.pow(this.y - point.getY(), 2));
}
public Point midpoint(Point point){
  int mx=((this.x + point.getX())/2);
  int my=((this.y + point.getY())/2);
  return new Point(mx,my);
}
public double slope(Point point){
  return ((point.getY()-this.y)/(point.getX()-this.x));
}
public boolean isCollinear(Point point, Point point2) {
    if (this.slope(point) == this.slope(point2)){
      return true;
    }
    return false;
}
public String toString(){
  return ("(" +this.x+ "," + this.y+") ");
  }
}
