package com.patterns.flyweight;

public class TeslaTank {

    private String name;
    private int x;
    private int y;
    private int hpLeft;
    private UnitStats stats;

    public TeslaTank(int x, int y) {
        stats = UnitStatsRepository.getTestTankUnitStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }
}
