package org.example;

public interface DoOrderRepo {
void addOrder(Order order);

void removeOrder(Order order);

Order findOrder(Order order);
}
