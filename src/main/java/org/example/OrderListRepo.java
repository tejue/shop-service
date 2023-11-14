package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderListRepo {

    List<Order> ordersList = new ArrayList<>();

    // GETTER & SETTER
    public List<Order> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Order> ordersList) {
        this.ordersList = ordersList;
    }

    // EQUALS & HASH-CODE
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderListRepo orderRepo = (OrderListRepo) o;
        return Objects.equals(ordersList, orderRepo.ordersList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordersList);
    }

    // TO-STRING
    @Override
    public String toString() {
        return "OrderRepo{" +
                "orders=" + ordersList +
                '}';
    }

    // METHODS

    // ADD ORDER
    public void addOrder(Order order) {
        ordersList.add(order);
    }

    // REMOVE ORDER
    public void removeOrder(Order order) {
        ordersList.remove(order);
    }

    // QUERY ORDER
    public Order findOrder(Order searchedOrder) {
        for (Order order : ordersList) {
            if (order == searchedOrder)
                return order;
        }
        return null;
    }
}
