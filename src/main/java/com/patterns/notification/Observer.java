package com.patterns.notification;

import com.patterns.order.Order;

public interface Observer {

    void update(Order order);
}
