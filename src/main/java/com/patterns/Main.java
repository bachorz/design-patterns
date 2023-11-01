package com.patterns;

import com.patterns.templateMethod.AutomaticTransmitionStartingSequence;
import com.patterns.templateMethod.CarStartingSequence;
import com.patterns.workDay.MyDay;
import com.patterns.workDay.TransportType;
import com.patterns.workDay.WeekDay;

public class Main {

    public static void main(String[] args){
        System.out.println("Design patterns");

        CarStartingSequence carStartingSequence = new AutomaticTransmitionStartingSequence();
        carStartingSequence.startTheCar();

        WeekDay weekDay = new MyDay();
        weekDay.everyDayIsExaclyTheSame(TransportType.TRAM);
    }
}
