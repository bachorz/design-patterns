package com.patterns.singleton;

public class GameEngine {

    private int hp = 100;
    private String characterName = "";

    private static GameEngine instance = new GameEngine();

    private GameEngine(){

    }

    public void run(){
        while(true){

        }
    }

    public static GameEngine getInstance() {
//        if(instance==null){
//            instance = new GameEngine();
//        }
        return instance;
    }
}
