package com.patterns.factory;

abstract public class Factory {

    abstract public InfantryUnit createInfantryUnit(UnitType unitType);
    abstract public MechanizedUnit createMechanizedUnit(UnitType unitType);
    abstract public AirUnit createAirUnit(UnitType unitType);
}
