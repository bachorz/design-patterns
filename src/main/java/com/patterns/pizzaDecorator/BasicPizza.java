package com.patterns.pizzaDecorator;

import java.math.BigDecimal;

public class BasicPizza implements PizzaOrder{
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(10.0);
    }

    @Override
    public String getDescription() {
        return "Dough and tomato sause";
    }

    @Override
    public boolean additionalCheese() {
        return false;
    }
}
