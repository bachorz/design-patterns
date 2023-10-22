package com.patterns.decoratorMeal;

public class SauceMealDecorator extends MealDecorator{

    protected Meal meal;

    public SauceMealDecorator(Meal meal) {
        super(meal);
    }

    public void addSauce(){
        System.out.println("Do dania dodaj sos.");
    }
}
