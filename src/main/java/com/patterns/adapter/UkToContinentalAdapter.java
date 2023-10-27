package com.patterns.adapter;

public class UkToContinentalAdapter implements ContinentalDevice{

    UKDevice device;

    public UkToContinentalAdapter(UKDevice device) {
        this.device = device;
    }

    @Override
    public void onContinentalDevice() {
        device.powerOnUKDevice();
    }
}
