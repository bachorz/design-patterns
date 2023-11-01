package com.patterns.templateMethod;

public class ClassicCarStartingSequence extends CarStartingSequence{
    @Override
    public void setTheGear() {
        System.out.println("Set a gear");
    }

    @Override
    public void startTheIgnition() {
        System.out.println("Turning key");
    }
}
