package com.patterns.adapter;

public class TwoWayAdapter implements UKDevice, ContinentalDevice{

    UKDevice ukDevice;
    ContinentalDevice continentalDevice;

    public TwoWayAdapter(UKDevice ukDevice, ContinentalDevice continentalDevice) {
        this.ukDevice = ukDevice;
        this.continentalDevice = continentalDevice;
    }

    @Override
    public void onContinentalDevice() {
        ukDevice.powerOnUKDevice();
    }

    @Override
    public void powerOnUKDevice() {
        continentalDevice.onContinentalDevice();
    }
}
