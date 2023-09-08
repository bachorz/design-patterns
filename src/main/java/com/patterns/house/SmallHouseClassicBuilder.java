package com.patterns.house;

public class SmallHouseClassicBuilder implements HouseClassicBuilder {

    private HouseClassic houseClassic;

    public SmallHouseClassicBuilder() {
        this.houseClassic = new HouseClassic();
    }

    @Override
    public void buildWalls() {
        this.houseClassic.setWalls("small walls classic");
    }

    @Override
    public void buildFloors() {
        this.houseClassic.setFloors("small floors classic");
    }

    @Override
    public void buildRooms() {
        this.houseClassic.setRooms("small rooms classic");
    }

    @Override
    public void buildRoof() {
        this.houseClassic.setRoof("small roof classic");
    }

    @Override
    public void buildWindows() {
        this.houseClassic.setWindows("small windows classic");
    }

    @Override
    public void buildDoors() {
        this.houseClassic.setDoors("small doors classic");
    }

    @Override
    public void buildGarage() {
        this.houseClassic.setGarage("small garage classic");
    }

    @Override
    public HouseClassic getHouseClassic() {
        return houseClassic;
    }
}
