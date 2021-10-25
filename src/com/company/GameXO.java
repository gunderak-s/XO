package com.company;

import java.util.Random;

public class GameXO {
    char [][] field={{'X',' ','X'},
                     {'X','X','X'},
                     {'X',' ','O'},
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

    boolean isEndGame() {
        if ((field[0][0]=='X') &(field[1][0]=='X') &(field[2][0]=='X'))
            return true;
        if ((field[0][1]=='X') &(field[1][1]=='X') &(field[2][1]=='X'))
            return true;
        if ((field[0][2]=='X') &(field[1][2]=='X') &(field[2][2]=='X'))
            return true;
        if ((field[0][0]=='X') &(field[0][1]=='X') &(field[0][2]=='X'))
            return true;
        if ((field[1][0]=='X') &(field[1][1]=='X') &(field[1][2]=='X'))
            return true;
        if ((field[0][2]=='X') &(field[2][1]=='X') &(field[2][2]=='X'))
            return true;
        if ((field[0][0]=='X') &(field[1][1]=='X') &(field[2][2]=='X'))
            return true;
        if ((field[0][2]=='X') &(field[1][1]=='X') &(field[2][0]=='X'))
            return true;
        if ((field[0][0]=='0') &(field[1][0]=='0') &(field[2][0]=='0'))
            return true;
        if ((field[0][1]=='0') &(field[1][1]=='0') &(field[2][1]=='0'))
            return true;
        if ((field[0][2]=='0') &(field[1][2]=='0') &(field[2][2]=='0'))
            return true;
        if ((field[0][0]=='0') &(field[0][1]=='0') &(field[0][2]=='0'))
            return true;
        if ((field[1][0]=='0') &(field[1][1]=='0') &(field[1][2]=='0'))
            return true;
        if ((field[0][2]=='0') &(field[2][1]=='0') &(field[2][2]=='0'))
            return true;
        if ((field[0][0]=='0') &(field[1][1]=='0') &(field[2][2]=='0'))
            return true;
        if ((field[0][2]=='0') &(field[1][1]=='0') &(field[2][0]=='0'))
            return true;
        return false;

    }
}
