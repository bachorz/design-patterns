package com.patterns.house;

public class HouseDirector {

   private HouseClassicBuilder houseClassicBuilder;

    public HouseDirector(HouseClassicBuilder houseClassicBuilder) {
        this.houseClassicBuilder = houseClassicBuilder;
    }

    public void buildHouse() {
        houseClassicBuilder.buildDoors();
        houseClassicBuilder.buildGarage();
        houseClassicBuilder.buildFloors();
        houseClassicBuilder.buildRoof();
        houseClassicBuilder.buildRooms();
        houseClassicBuilder.buildWalls();
        houseClassicBuilder.buildWindows();
    }

    public HouseClassic getHouseClassic() {
        return this.houseClassicBuilder.getHouseClassic();
    }
}
