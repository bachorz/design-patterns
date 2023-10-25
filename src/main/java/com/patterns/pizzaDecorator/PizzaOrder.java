package com.patterns.pizzaDecorator;

import java.math.BigDecimal;

public interface PizzaOrder {

    BigDecimal getCost();
    String getDescription();
    boolean additionalCheese();
}
