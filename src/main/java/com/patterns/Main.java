package com.patterns;

import com.patterns.decorator.*;
import com.patterns.decoratorMeal.*;
import com.patterns.pizzaDecorator.AdditionalCheeseDecorator;
import com.patterns.pizzaDecorator.BasicPizza;
import com.patterns.pizzaDecorator.PizzaOrder;
import com.patterns.pizzaDecorator.ToppingPizzaDecorator;

public class Main {
    
    public static void main (String[] args) {

     //   generateMap();

    //    prepareMeal();

        orderPizza();
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

    public static void prepareMeal(){

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

    public static void orderPizza(){

        PizzaOrder pizzaOrder = new BasicPizza();
        System.out.println(pizzaOrder.getDescription() + " cost " + pizzaOrder.getCost());
        pizzaOrder = new ToppingPizzaDecorator(pizzaOrder, "salami");
        System.out.println(pizzaOrder.getDescription() + " cost " + pizzaOrder.getCost());
        pizzaOrder = new ToppingPizzaDecorator(pizzaOrder, "olives");
        System.out.println(pizzaOrder.getDescription() + " cost " + pizzaOrder.getCost());
        pizzaOrder = new AdditionalCheeseDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getDescription() + " cost " + pizzaOrder.getCost());

    }


}
