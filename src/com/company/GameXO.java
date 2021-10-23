package com.company;

public class GameXO {
    boolean checkGameOver() {

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