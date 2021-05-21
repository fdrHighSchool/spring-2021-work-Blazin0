public class Main {
  public static void main(String[] args) {
    Board board = new Board(10, 10);
    int r = 0;
    board.printBoard();
    while(r != 100){
      board.printBoard();
      board.updateBoard();
      board.alive();
      r++;
    }
  }
}
