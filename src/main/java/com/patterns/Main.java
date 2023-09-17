package com.patterns;

import com.patterns.carFactory_task.*;
import com.patterns.factory.*;

public class Main {

    public static void main(String[] args) {
//        Factory blueFactory = new BlueFactory();
//        Factory redFactory = new RedFactory();
//
//        MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);
//        InfantryUnit redRifleman = redFactory.createInfantryUnit(UnitType.RIFLEMAN);
//
//        MechanizedUnit blueTank = blueFactory.createMechanizedUnit(UnitType.TANK);
//        InfantryUnit blueRifleman = blueFactory.createInfantryUnit(UnitType.RIFLEMAN);
//
//        AirUnit blueHelicopter = blueFactory.createAirUnit(UnitType.HELICOPTER);
//        AirUnit redHelicopter = redFactory.createAirUnit(UnitType.HELICOPTER);

        FactoryCar commonwealthFactory = new CommonwealthFactory();
        FactoryCar continentalFactory = new ContinentalFactory();

        Car bmw = commonwealthFactory.buildBMW(BMWModel.E60);
        System.out.println(bmw.getSteeringWheelPosition());

        Car ford = continentalFactory.buildFord(FordModel.CMAX);
        System.out.println(ford.getSteeringWheelPosition());

    }





}
