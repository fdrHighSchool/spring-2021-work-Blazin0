//0 = dead
//1 = alive
import java.util.*;
public class Board{
  private int[][] arr;
  private int numAlive;

  public Board(int x,int y){
    arr = new int[x][y];
    fillBoard();
  }

  public void printBoard(){
    for(int row = 0; row < arr.length;row ++){
      for(int col = 0;col < arr[0].length;col++){
        if(arr[row][col] != 0){
          System.out.print("\u001B[41mX\u001B[0m ");
        }
        else{
          System.out.print("0 ");
        }
      }
      System.out.println();

    }
    System.out.println();
  }


  public void updateBoard(){
    //a sort of code that checks adjacent squares
    int[][] nextGen = new int[arr.length][arr[0].length];
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[0].length; j++){
        // for each element, determine how many neighbors are alive
        int aliveNeighbors = countNeighbors(i, j);
        // System.out.println(i + " " + j + ": " + aliveNeighbors);


        // code the rules for the element's next state
        //Any live cell with fewer than two live neighbours dies, as if by underpopulation.
        //Any live cell with more than three live neighbours dies, as if by overpopulation.
        //return ((!this.state && n == 3) || (this.state && (n == 2 || n == 3)))
        if (arr[i][j] == 1 && (aliveNeighbors == 2 || aliveNeighbors == 3)) {
          nextGen[i][j] = 1;
        }

        //Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
       else if (arr[i][j] == 0 && aliveNeighbors == 3) {
          nextGen[i][j] = 1;
        }

        else {
          nextGen[i][j] = 0;
        }
      }
    }
    arr = nextGen;
  }

  public int countNeighbors(int i, int j){
    int ALN = 0;//AliveNeighbors

    for(int I = -1; I < 2; I++){
      for(int J = -1; J < 2; J++){
        // System.out.println(i + ", " + I + ", " + j + ", "+ J);
        if(arr[(i + I + arr.length) % arr.length][(j + J + arr[i].length) % arr[i].length] != 0){
          ALN++;
        }
      }
        // System.out.println("Alive: " + countalive);
    }
    if (arr[i][j] == 1) {
      ALN--;
    }
    return ALN;
  }
  public void alive(){
    int alive = 0;
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[0].length;j++){
        if(arr[i][j] == 1){
          alive++;
        }
      }
    }
    System.out.println("Alive Neighbors: " + alive);
  }
  public void fillBoard(){
    for(int i = 0;i < arr.length;i++){
      for(int j = 0;j < arr[0].length;j++){
        if(Math.round(Math.random()*(100-1)+1) > 59){
          arr[i][j] = 1;
        }
      }
    }
  }


}
  /*
  public void adjacent(int i, int j){
    int test = 0;
    int ALN = 0;//AliveNeighbors
    for(int I = -1; I < 2; I++){
      for(int J = -1; J < 2;J++){
        if(i+I < 0 && j+J < 0){
          if(arr[i+I % arr.length][j+J % arr.length] != 0){
            ALN++;
          }
        }
        if(j+J <= 0){
          if(arr[i+I][j % arr.length] != 0){
            ALN++;
          }
        }
        if(i+I <= 0){
          if(arr[i % arr.length][j+J] != 0){
            ALN++;
          }
        }

        System.out.println(ALN);
      }
    }
    ALN = ALN - 1;
  }
  */
  
