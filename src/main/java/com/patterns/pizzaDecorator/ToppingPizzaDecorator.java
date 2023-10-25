package com.patterns.pizzaDecorator;

import java.math.BigDecimal;

public class ToppingPizzaDecorator extends AbstractPizzaOrderDecorator {

    public String toppingName;

    public ToppingPizzaDecorator(PizzaOrder pizzaOrder, String toppingName) {
        super(pizzaOrder);
        this.toppingName = toppingName;
    }

    @Override
    public boolean additionalCheese() {
        return super.additionalCheese();
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" + " + toppingName ;
    }
}
