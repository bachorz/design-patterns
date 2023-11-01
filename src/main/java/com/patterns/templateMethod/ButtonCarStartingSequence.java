package com.patterns.templateMethod;

public class ButtonCarStartingSequence extends ClassicCarStartingSequence{

    @Override
    public void startTheIgnition() {
        System.out.println("Press key");
    }
}
