package org.example;

import java.util.HashMap;
import java.util.Map;

public class OrderMapRepo implements DoOrderRepo {
    Map<Integer, Order> ordersMap = new HashMap<>();

    @Override
    public void addOrder(Order order) {
        ordersMap.put(order.orderID(), order);
    }

    @Override
    public void removeOrder(Order order) {
        ordersMap.remove(order.orderID());
    }

    @Override
    public Order findOrder(Order order) {
        return ordersMap.get(order.orderID());
    }

}
