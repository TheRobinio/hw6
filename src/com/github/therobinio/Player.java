package com.github.therobinio;

public abstract class Player {


    BetMore_Game bmg;

    public Player(BetMore_Game bmg) {
        this.bmg = bmg;
    }

    public void start() {
        bmg.play(this);
    }
}
