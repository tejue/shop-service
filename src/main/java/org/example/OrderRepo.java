package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderRepo {

    List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public void findOrder() {
        for(Order order : orders) {
            System.out.println(order);
        }
    }
}
