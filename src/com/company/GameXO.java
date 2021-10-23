package com.company;

import java.util.Random;

public class GameXO {
    char [][] field={{' ',' ','X'},
                     {' ','X','X'},
                     {' ',' ','O'},
    };


    public void randomComp(){
        Random comp=new Random();
    }


    void printField () {
        System.out.println("...........................");
        for (int i=0;i<=2;i++) {
            System.out.println("..........|"+field[i][0]+"|"+field[i][1]+"|"+field[i][2]+"|..........");
        }
        System.out.print("...........................");
    }

}
