package com.company;

import java.util.ArrayList;
import java.util.Random;

public class GameXO {
    char [][] field={{'X',' ','X'},
                     {'X','X','X'},
                     {'X',' ','O'},
    };
    ArrayList<Move> moves;
    final boolean firstMoveIsHumans;
    Tree gameOXtree;

    public GameXO(boolean firstMoveIsHumans) {
        this.firstMoveIsHumans = firstMoveIsHumans;
    }


    public void randomComp(){   // Вови
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


    void printField () {    // Андрія
        System.out.println("...........................");
        for (int i=0;i<=2;i++) {
            System.out.println("..........|"+field[i][0]+"|"+field[i][1]+"|"+field[i][2]+"|..........");
        }
        System.out.print("...........................");
    }

    boolean isEndGame() {   // Олени
        if ((field[0][0]=='X') &(field[1][0]=='X') &(field[2][0]=='X'))
            return true;
        return false;

    }
}
