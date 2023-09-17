package com.patterns.carFactory_task;

public class CommonwealthFactory extends FactoryCar {

    SteeringWheelPosition steeringWheelPosition = SteeringWheelPosition.RIGHT;
    @Override
    public Bmw buildBMW(BMWModel bmwModel) {
        switch (bmwModel) {
            case E60:
                return new Bmw(2000, "PB", 2022, steeringWheelPosition);

            case X5:
                return new Bmw(2500, "PB", 2023, steeringWheelPosition);

            default:
                throw new UnsupportedOperationException("No such model");
        }
    }

    @Override
    public Ford buildFord(FordModel fordModel) {
        switch (fordModel) {
            case CMAX:
                return new Ford(2000, "PB", 2022, steeringWheelPosition);

            case Focus:
                return new Ford(1500, "ON ", 2023, steeringWheelPosition);

            default:
                throw new UnsupportedOperationException("No such model");
        }
    }
}
