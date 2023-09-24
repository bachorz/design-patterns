package com.patterns.flyweight;

public class UnitStatsRepository {

    private static UnitStats destroyerUnitStats = new UnitStats("Destroyer", 500, 250, 222, 666, 123);
    private static UnitStats testTankUnitStats = new UnitStats("TeslaTank", 200, 100, 50, 25, 0);
    private static UnitStats riflemanUnitStats = new UnitStats("Rifleman", 300, 120, 44, 2, 34);

    private UnitStatsRepository(){};

    public static UnitStats getDestroyerUnitStats() {
        return destroyerUnitStats;
    }

    public static UnitStats getTestTankUnitStats() {
        return testTankUnitStats;
    }

    public static UnitStats getRiflemanUnitStats() {
        return riflemanUnitStats;
    }
}
