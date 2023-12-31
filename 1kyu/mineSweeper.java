// nog laatste stap wanneer lege rij implementeren

import org.apache.commons.lang3.StringUtils;
import java.util.*;

class MineSweeper {
  int nMines;
  String[][] board;
  int sizeBoard;
  int minesFound;
    
    public MineSweeper(final String board, final int nMines) {
      this.nMines = nMines;  
      this.minesFound = 0;
//       converting string to string matrix
      String[] array = board.split("\n");
      this.sizeBoard = array.length;
      this.board = new String[sizeBoard][sizeBoard];
      for (int i=0; i<sizeBoard; i++){
        String[] row = array[i].split(" ");
        for (int j=0; j<sizeBoard; j++){
          this.board[i][j] = row[j];
        }
      }
    }
  
    private String boardToString(){
//       System.out.println("In function boardToString()");
      String resBoard = new String("");
      for (int i=0; i<board.length; i++){
        for (int j=0; j<board[i].length; j++){
          resBoard = resBoard + board[i][j] + " ";
        }
        StringUtils.chop(resBoard);
        resBoard = resBoard + "\n";
      }
      return resBoard;
    }
  
  private int around(int i, int j, String s){
    int n = 0;
    if (i-1 >= 0){
      if (board[i-1][j].equals(s)){
        n++;
      }
      if (j-1 >= 0){
        if (board[i-1][j-1].equals(s)){
          n++;
        }
      }
      if (j+1 <= sizeBoard-1){
        if (board[i-1][j+1].equals(s)){
          n++;
        }
      }
    }
    if (i+1<=sizeBoard-1){
      if (board[i+1][j].equals(s)){
        n++;
      }
      if (j-1 >= 0){
        if (board[i+1][j-1].equals(s)){
          n++;
        }
      }
      if (j+1 <= sizeBoard-1){
        if (board[i+1][j+1].equals(s)){
          n++;
        }
      }
    }
    if (j-1 >= 0){
      if (board[i][j-1].equals(s)){
          n++;
      }
    }
    if (j+1 <= sizeBoard-1){
      if (board[i][j+1].equals(s)){
          n++;
      }
    }
    return n;
  }
  
  private void openAround(int i, int j){
    int res;
    if (i-1 >= 0){
      if (board[i-1][j].equals("?")){
        res = Game.open(i-1, j);
        board[i-1][j] = String.valueOf(res);
      }
      if (j-1 >= 0){
        if (board[i-1][j-1].equals("?")){
          res = Game.open(i-1, j-1);
          board[i-1][j-1] = String.valueOf(res);
        }
      }
      if (j+1 <= sizeBoard-1){
        if (board[i-1][j+1].equals("?")){
          res = Game.open(i-1, j+1);
          board[i-1][j+1] = String.valueOf(res);
        }
      }
    }
    if (i+1<=sizeBoard-1){
      if (board[i+1][j].equals("?")){
        res = Game.open(i+1, j);
        board[i+1][j] = String.valueOf(res);
      }
      if (j-1 >= 0){
        if (board[i+1][j-1].equals("?")){
          res = Game.open(i+1, j-1);
          board[i+1][j-1] = String.valueOf(res);
        }
      }
      if (j+1 <= sizeBoard-1){
        if (board[i+1][j+1].equals("?")){
          res = Game.open(i+1, j+1);
          board[i+1][j+1] = String.valueOf(res);
        }
      }
    }
    if (j-1 >= 0){
      if (board[i][j-1].equals("?")){
        res = Game.open(i, j-1);
        board[i][j-1] = String.valueOf(res);
      }
    }
    if (j+1 <= sizeBoard-1){
      if (board[i][j+1].equals("?")){
        res = Game.open(i, j+1);
        board[i][j+1] = String.valueOf(res);
      }
    }
  }
  
  private void fillBombAround(int i, int j){
    if (i-1 >= 0){
      if (board[i-1][j].equals("?")){
        minesFound++;
        board[i-1][j] = "x";
      }
      if (j-1 >= 0){
        if (board[i-1][j-1].equals("?")){
          minesFound++;
          board[i-1][j-1] = "x";
        }
      }
      if (j+1 <= sizeBoard-1){
        if (board[i-1][j+1].equals("?")){
          minesFound++;
          board[i-1][j+1] = "x";
        }
      }
    }
    if (i+1<=sizeBoard-1){
      if (board[i+1][j].equals("?")){
        minesFound++;
        board[i+1][j] = "x";
      }
      if (j-1 >= 0){
        if (board[i+1][j-1].equals("?")){
          minesFound++;
          board[i+1][j-1] = "x";
        }
      }
      if (j+1 <= sizeBoard-1){
        if (board[i+1][j+1].equals("?")){
          minesFound++;
          board[i+1][j+1] = "x";
        }
      }
    }
    if (j-1 >= 0){
      if (board[i][j-1].equals("?")){
        minesFound++;
        board[i][j-1] = "x";
      }
    }
    if (j+1 <= sizeBoard-1){
      if (board[i][j+1].equals("?")){
        minesFound++;
        board[i][j+1] = "x";
      }
    }
  }
  
  private boolean unsolved(){
    for (int i = 0; i<board.length; i++){
      for (int j=0; j<board[i].length; j++){
        if (board[i][j].equals("?")){
          return true;
        }
      }
    }
    return false;
  }
  
  private int[] identifyProblem(){
    
  }
  
  private void takeAction(){
    
  }
    
    
  public String solve() {
    int numberOfBombs;
    int curVal;
    int numberUnsolved;
    int checkNotInfinteLoop = 0;
    int action = 1;
    while (checkNotInfinteLoop < 10 && this.minesFound != this.nMines){
      if (action == 0){
        System.out.println(checkNotInfinteLoop);
      }
      action = 0;
      for (int i = 0; i<board.length; i++){
        for (int j=0; j<board[i].length; j++){
          if (!board[i][j].equals("?") && !board[i][j].equals("x")){
            curVal = Integer.parseInt(board[i][j]);
            numberUnsolved = around(i, j, "?");
            if (numberUnsolved == 0){
//                 nothing to do here
              continue;
            }
            numberOfBombs = around(i, j, "x");

            if (curVal == numberOfBombs){
//               All bombs are detected, safely open squares
              openAround(i,j);
              action++;
            }
            if (numberUnsolved + numberOfBombs == curVal){
//               these are all bombs!
              fillBombAround(i,j);
              action++;
            }
          }
        }
      }
      checkNotInfinteLoop++;
    }
    return boardToString();
  }
}