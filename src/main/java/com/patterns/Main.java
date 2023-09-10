package com.patterns;

import com.patterns.factory.*;

public class Main {

    public static void main(String[] args) {
        InfantryFactory factory = new RedInfantryUnitFactory();

        InfanrtyUnit tank = factory.createUnit(UnitType.TANK);
        InfanrtyUnit rifleman = factory.createUnit(UnitType.RIFLEMAN);

    }





}
