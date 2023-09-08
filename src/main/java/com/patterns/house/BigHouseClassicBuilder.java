package com.patterns.house;

public class BigHouseClassicBuilder implements HouseClassicBuilder{

    private HouseClassic houseClassic;

    public BigHouseClassicBuilder() {
        this.houseClassic = new HouseClassic();
    }
    @Override
    public void buildWalls() {
        this.houseClassic.setWalls("big walls classic");
    }

    @Override
    public void buildFloors() {
        this.houseClassic.setFloors("big floors classic");
    }

    @Override
    public void buildRooms() {
        this.houseClassic.setRooms("big rooms classic");
    }

    @Override
    public void buildRoof() {
        this.houseClassic.setRoof("big roof classic");
    }

    @Override
    public void buildWindows() {
        this.houseClassic.setWindows("big windows classic");
    }

    @Override
    public void buildDoors() {
        this.houseClassic.setDoors("big doors classic");
    }

    @Override
    public void buildGarage() {
        this.houseClassic.setGarage("big garage classic");
    }

    @Override
    public HouseClassic getHouseClassic() {
        return houseClassic;
    }
}
