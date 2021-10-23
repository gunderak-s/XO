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

    boolean isEndGame() {
        if ((field[0][0]=='X') &(field[1][0]=='X') &(field[2][0]=='X'))
        return true;


    }
}
