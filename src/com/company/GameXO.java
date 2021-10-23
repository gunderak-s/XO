package com.company;

import java.util.Random;

public class GameXO {
    char [][] field={{' ',' ','X'},
                     {' ','X','X'},
                     {' ',' ','O'},
    };


    public void randomComp(){
        Random random=new Random();
        boolean good=true;
        while (good) {
            int x = random.nextInt(3);
            int y = random.nextInt(3);
            if (field[y][x] == ' ') {
                field[y][x] = 'O';
                good=false;
            } else {good=true;
            }
        }
    }


    void printField () {


    }

    boolean checkGameOver () {
        return true;
    }

    boolean isEndGame(char playerSymbo1) {
      boolean result=false;
      if (checkWin(playerSymbo1, map)) {
          System.out.println("Виграли" +playerSymbo1 + '!');
          result=true;
      }
       if (isMapFull()&& !checkWin(playerSymbo1, map)) {
           System.out.println("Нічия");
           result=true;
       }
      return result;
    }
}
