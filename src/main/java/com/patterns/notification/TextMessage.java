package com.patterns.notification;

import com.patterns.order.Order;

public class TextMessage implements Observer {

    public void update(Order order) {
        System.out.println("Sms - zamówienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}
