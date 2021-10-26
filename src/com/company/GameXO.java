package com.company;

import java.util.Random;

public class GameXO {
    char [][] field={{'X',' ','X'},
                     {'X','X','X'},
                     {'X',' ','O'},
    };
    GameStatus gameStatus;

    void gameProgress(){
        // рандомний вибір ходу

        while(){

            printField ();
        }



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


    }

    GameStatus isEndGame() {   // Олени
       for (int i=0; i<=2; i++) {
           if ((field[i][0] == 'X') & (field[i][0] == 'X') & (field[i][0] == 'X'))
               return GameStatus.Win;
           if ((field[0][i] == 'X') &(field[0][i])=='X' &(field[0][i]=='X'))
               return GameStatus.Win;
           if ((field[0][0] =='X') &(field[1][1]=='X') &(field[2][2]=='X'))
               return GameStatus.Win;
           if ((field[0][2]=='X') &(field[1][1]=='X') &(field[2][0]=='X'))
               return GameStatus.Win;
       }
        return false;

    }
}
enum GameStatus{
    Game,Draw,Win
}
