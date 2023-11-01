package com.patterns.templateMethod;

public abstract class CarStartingSequence {

    public final void startTheCar(){
        fastenSeatbelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void go() {
        System.out.println("Press the power tap");
    }

    private void fastenSeatbelts() {
        System.out.println("Fasten seatbelts");
    }

    public abstract void setTheGear();

    public abstract void startTheIgnition();
}
