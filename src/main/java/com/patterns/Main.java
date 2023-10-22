package com.patterns;

import com.patterns.decorator.*;
import com.patterns.decoratorMeal.*;

public class Main {
    
    public static void main (String[] args) {

     //   generateMap();

        preapreMeal();
    }

    private static void generateMap() {

        Terrain plain = new Plain();
        Terrain hill = new Hill();
        Terrain terrain = new SwampDecorator(hill);
        Terrain terrain1 = new SwampDecorator(new ForestDecorator(plain));
        Terrain terrain2 = new RoadDecorator(hill);

        System.out.println("Swamp hill cost " + terrain.getFuelCost());
        System.out.println("Swamp forest plain cost " + terrain1.getFuelCost());
        System.out.println(terrain2.getDescription() + " " +  terrain2.getFuelCost());

    }

    public static void preapreMeal(){

        System.out.println("Nowy posiłek: ");
        Meal riceMeal = new RiceMeal();
        riceMeal.prepareMeal();
        System.out.println("\nNowy posiłek: ");
        Meal riceMealWithShrimp = new ShrimpMealDecorator(new RiceMeal());
        riceMealWithShrimp.prepareMeal();
        System.out.println("\nNowy posiłek: ");
        Meal potatoMealWithChickenAndSauce = new SauceMealDecorator(new ChickenMealDecorator(new PotatoMeal()));
        potatoMealWithChickenAndSauce.prepareMeal();

    }


}
