package com.patterns.decoratorMeal;

public class ChickenMealDecorator extends MealDecorator{

    protected Meal decoratorMeal;

    public ChickenMealDecorator(Meal decoratorMeal) {
        super(decoratorMeal);
    }

    public void addChicken(){
        System.out.println("Do dania dodaję kurczaka.");
    }
}
