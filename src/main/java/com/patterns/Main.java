package com.patterns;

import com.patterns.workshop.CoffeeMaker;
import com.patterns.workshop.Robot;
import com.patterns.workshop.WorkshopApp;
import com.patterns.workshop.boombox.*;
import com.patterns.workshop.command.*;

public class Main {

    public static void main(String[] args){

//        Robot robot = new Robot();
//        WorkshopApp workshopApp = new WorkshopApp();
/*        workshopApp.addToQueue(new RobotTurnOnCommand(robot));
        workshopApp.addToQueue(new RobotCutCommand(robot));
        workshopApp.addToQueue(new RobotDrillCommand(robot));
        workshopApp.addToQueue(new RobotTurnOffCommand(robot));

        workshopApp.run();

        workshopApp.run();


        CoffeeMaker coffeeMaker = new CoffeeMaker();
        workshopApp.addToQueue(new CoffeeMakerTurnOnCommand(coffeeMaker));
        workshopApp.addToQueue(new CoffeeMakerTurnOffCommand(coffeeMaker));

        workshopApp.run();*/

//        workshopApp.addToQueue(new RobotTurnOnCommand(robot));
//        workshopApp.run();
//        workshopApp.undoLastCommand();

        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();
        remote.setMusicPlayerCommand(new PlayFirstTrackCommand(musicPlayer));
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayNextTrackCommand(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayRandomTrackCommand(musicPlayer));
        remote.pressButton();
        remote.pressButton();
    }
}
