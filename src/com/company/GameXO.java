package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
    GameStatus gameStatus;

    void gameProgress(){
        // рандомний вибір ходу
        boolean hM =firstMoveIsHumans;
        while(isEndGame()==GameStatus.Game){
            printField ();
            if(hM)
                humansMove();
            else
                randomComp();
            hM =!hM;
        }
        // додати перевірку статусу
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
    void humansMove(){
        int co = 0;
        int x = 0;
        int y = 0;
        boolean a = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введіть координати від 11 до 33");
            if (scanner.hasNextInt()) {
                co = scanner.nextInt();
                x = co / 10;
                y = co % 10;
            }
            if(x>=1 && x<=3 &&y>=1 && y<=3 && field[x-1][y-1]==' ')
                a = false;
            else a=true;

        } while (a);
        field[x-1][y-1]='X';

    }


    void printField () {    // Андрія
        for (int i=0;i<=2;i++) {
            for (int j = 0; j <= 2; j++)
                System.out.print(field[i][j]);
            System.out.println();
        }
    }

    GameStatus isEndGame() {   // Олени
        for (int i=0;i<=2;i++)
            if ((field[0][i]=='X') &(field[1][i]=='X') &(field[2][i]=='X'))
                return GameStatus.Win;



    }
}
enum GameStatus{
    Game,Draw,Win
}