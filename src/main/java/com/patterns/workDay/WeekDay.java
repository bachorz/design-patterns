package com.patterns.workDay;

public abstract class WeekDay {

    public final void everyDayIsExaclyTheSame(TransportType transportType) {
        wakeUp();
        getReady();
        int time = goToWork(transportType);
        summary(time);
        work();
        goHome();
    }

    private void goHome() {
        System.out.println("Powrot do domu");
    }

    protected abstract void work();
    protected abstract int goToWork(TransportType transport);
    protected void summary(int time) {
        System.out.println("Trasa do pracy zajęła: " + time + " minut");
    }

    private void getReady() {
        System.out.println("Przygotowania do wyjscia");
    }

    private void wakeUp() {
        System.out.println("Pobudka");
    }
}
