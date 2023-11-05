package com.patterns.workshop.command;

import com.patterns.workshop.CoffeeMaker;

public class CoffeeMakerTurnOnCommand implements Command{

    private CoffeeMaker coffeeMaker;

    public CoffeeMakerTurnOnCommand(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        coffeeMaker.turnOn();
    }

    @Override
    public void undo() {
        coffeeMaker.turnOff();
    }
}
