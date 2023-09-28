package com.patterns.adapter;

public class ContinentalToUkAdapter  implements UKDevice{

    ContinentalDevice continentalDevice;

    public ContinentalToUkAdapter(ContinentalDevice continentalDevice) {
        this.continentalDevice = continentalDevice;
    }

    @Override
    public void powerOnUKDevice() {
        continentalDevice.onContinentalDevice();
    }
}
