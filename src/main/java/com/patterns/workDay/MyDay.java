package com.patterns.workDay;

public class MyDay extends WeekDay {
    @Override
    protected void work() {
        System.out.println("Code monkey get up, get coffee");
    }

    @Override
    protected int goToWork(TransportType transport) {
        switch(transport) {
            case CAR:
                return 15;
            case BIKE:
                return 25;
            case TRAM:
                return 20;
            default:
                return 20;
        }
    }
}
