package com.patterns;

import com.patterns.singleton.GameEngine;
import com.patterns.singleton.GuessGame;

public class Main {

    public static void main(String[] args) {
//        GameEngine engine = GameEngine.getInstance();
//        GameEngine engine2 = GameEngine.getInstance();
//
//        System.out.println(engine==engine2);

        GuessGame game = GuessGame.getInstance();

        game.play();

        int score = game.getScore();

        GuessGame anotherGameReference = GuessGame.getInstance();

        if(game == anotherGameReference  ) {
            System.out.println("Singleton!");
            if(score == anotherGameReference.getScore()) {
                System.out.println("I punkty się zgadzają!");
            }
        }
    }
}
