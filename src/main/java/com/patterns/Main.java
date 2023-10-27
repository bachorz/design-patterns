package com.patterns;

import com.patterns.adapter.*;
import com.patterns.libraryAdapter.*;

public class Main {

    public static void main(String[] args) {

        ContinentalDevice radio = new ContinentalDevice() {

            @Override
            public void onContinentalDevice() {
                System.out.println("gra muzyka");
            }
        };

        ContinentalSocket continentalSocket = new ContinentalSocket();
        continentalSocket.plugIn(radio);

        UKDevice ukRadio = new UKDevice() {

            @Override
            public void powerOnUKDevice() {
                System.out.println("London is burning");
            }
        };

        UKSocket ukSocket = new UKSocket();

        ukSocket.plugIn(ukRadio);

        UkToContinentalAdapter adapterToCon = new UkToContinentalAdapter(ukRadio);
        continentalSocket.plugIn(adapterToCon);

        ContinentalToUkAdapter continentalToUkAdapter = new ContinentalToUkAdapter(radio);
        ukSocket.plugIn(continentalToUkAdapter);

        TwoWayAdapter adapter = new TwoWayAdapter(ukRadio, radio);
        continentalSocket.plugIn(adapter);
        ukSocket.plugIn(adapter);



        //ZADANIE
        User user = new User("Paweł","Cwik","32131212");
        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();
        APIAdapter apiAdapter = new APIAdapter(user, libraryAPIv2);
        BookConnector connector = new BookConnector(user,apiAdapter);
        connector.checkAviability("Harry Potter i Zakon Feniksa");
        connector.reserve("Harry Potter i Zakon Feniksa", user);

    }




}
