package com.patterns.house;

public interface HouseClassicBuilder {

    void buildWalls();
    void buildFloors();
    void buildRooms();
    void buildRoof();
    void buildWindows();
    void buildDoors();
    void buildGarage();

    HouseClassic getHouseClassic();
}
