package com.github.therobinio;

public class Game_Chair {

    Player player1;
    Player player2;
    BetMore_Game bmg;

    public Game_Chair() {
        bmg = new BetMore_Game();
        player1 = new Computer(bmg);
        player2 = new Person(bmg);
    }

    public void start() {
       player1.start();
       player2.start();
       System.out.println("The Winner is: "+ bmg.findWinner().getClass().getSimpleName());
    }


    public static void main(String[] args) {
        Game_Chair gc = new Game_Chair();
        gc.start();
    }
}
