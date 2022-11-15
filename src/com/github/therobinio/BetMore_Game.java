package com.github.therobinio;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BetMore_Game {

    HashMap<Player, Integer> numbers = new HashMap<>();

    public void play(Player p) {
        int randomNum = Shuffle.randomNum();
        if(p instanceof Person) {
            Scanner scanner = new Scanner(System.in);
            for(int i = 0; i < 5; i++) {
                System.out.println("You rolled: " + randomNum);
                System.out.println("Do you wanna role again? Type yes or no");
                String answer = scanner.nextLine();
                if (!answer.equalsIgnoreCase("yes")) {
                    break;
                }
                randomNum = Shuffle.randomNum();
            }
            scanner.close();
        }
        numbers.put(p,randomNum);
    }

    public Player findWinner() {
        for(Map.Entry<Player,Integer> x : numbers.entrySet()) {
            System.out.println(x.getKey().getClass().getSimpleName() +" picked the value: " + x.getValue());
        }
        return Collections.max(numbers.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
