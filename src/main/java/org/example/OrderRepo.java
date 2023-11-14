package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderRepo {

    List<Order> orders = new ArrayList<>();

    //GETTER & SETTER


    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    //EQUALS & HASH-CODE


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderRepo orderRepo = (OrderRepo) o;
        return Objects.equals(orders, orderRepo.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }

    //TO-STRING


    @Override
    public String toString() {
        return "OrderRepo{" +
                "orders=" + orders +
                '}';
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public Order findOrder(Order searchedOrder) {
        for (Order order : orders) {
            if (order == searchedOrder)
                return order;
        }
        return null;
    }
}
