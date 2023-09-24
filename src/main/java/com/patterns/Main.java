package com.patterns;

import com.patterns.chess.*;
import com.patterns.flyweight.Destroyer;
import com.patterns.flyweight.Rifleman;
import com.patterns.flyweight.TeslaTank;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> activeUnits = new ArrayList<>();

        for(int i = 0; i<1000; i++) {
            activeUnits.add(new TeslaTank(0,0));
            activeUnits.add(new Rifleman(0,0));
            activeUnits.add(new Destroyer(0,0));
        }

        // assignment

        ChessPiece blackPawn = new BlackPiece("Czarny Pionek","7", "a");
        ChessPiece whitePawn = new WhitePiece("Biały Pionek","2","a");
        ChessPiece blackQueen = new BlackQueen("Czarna Królowa");
        ChessPiece whiteQueen = new WhiteQueen("Biala Królowa");
        //exactly same color object is used
        System.out.println(blackPawn.getColor()==blackQueen.getColor());
        System.out.println(whitePawn.getColor()==whiteQueen.getColor());
    }
}
