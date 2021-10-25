package com.company;

public class TestGameOX {
    public static void main(String[] args) {
        GameXO game1=new GameXO(true);
        boolean b=game1.isEndGame();
        System.out.println(b);
        Produkt<GameXO> p1=new Produkt();
	    game1.printField();
	    int i = 56/10;
	    System.out.println(i);
    }
}
