package com.patterns.decoratorMeal;

public class ShrimpMealDecorator extends MealDecorator{

    protected Meal meal;

    public ShrimpMealDecorator(Meal meal) {
        super(meal);
    }

    public void addShrimp(){
        System.out.println("Dodaję do dania krewetki");
    }
}
