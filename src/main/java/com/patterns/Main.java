package com.patterns;

import com.patterns.flight.FlightLeg;
import com.patterns.house.*;

public class Main {

    public static void main(String[] args) {

        //builder z klasą wewnętrzną -> daje możliwość programiście ustawiania wartości na poszczególnych polach po utworzeniu obiektu

        House house = new House.HouseBuilder()
                .buildDoors("doors")
                .buildGarage("garage")
                .buildRoof("roof")
                .buildWindows("windows")
                .buildRooms("rooms")
                .build();

        System.out.println(house);

        //stare klasyczne podejście -> nie daje powyższej możliwości -> Director wie jak skonstruować poszczególny obiekt

        SmallHouseClassicBuilder smallHouseClassicBuilder = new SmallHouseClassicBuilder();
        BigHouseClassicBuilder bigHouseClassicBuilder = new BigHouseClassicBuilder();

        HouseDirector smallHouseDirector = new HouseDirector(smallHouseClassicBuilder);
        smallHouseDirector.buildHouse();

        HouseDirector bigHouseDIrector = new HouseDirector(bigHouseClassicBuilder);
        bigHouseDIrector.buildHouse();

        HouseClassic houseClassicSmall = smallHouseDirector.getHouseClassic();
        HouseClassic houseClassicBig = bigHouseDIrector.getHouseClassic();

        System.out.println("Classic " + houseClassicSmall);
        System.out.println("Classic " + houseClassicBig);

// Jeszcze inną metodą jest skorzystanie z Lomboka i ustawinie adnotacji @Builder na klasą, którą chcemy ogarnąć wzorcem Builder



        //Zadanie własne

        FlightLeg leg = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles").price(50).build();
        System.out.println(leg);

//
//        FlightLeg leg = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles").build();
//        System.out.println(leg);


    }
}
