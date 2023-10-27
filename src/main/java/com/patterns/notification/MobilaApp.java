package com.patterns.notification;

import com.patterns.order.Order;

public class MobilaApp implements Observer {

    public void update(Order order) {
        System.out.println("Aplikacja mobilna - Zamówienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }

}
