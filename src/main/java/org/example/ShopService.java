package org.example;

import java.util.List;

public class ShopService {
    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    // CONSTRUCTOR

    public ShopService() {
    }

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public ProductRepo getProductRepo() {
        return productRepo;
    }

    public void setProductRepo(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public OrderRepo getOrderRepo() {
        return orderRepo;
    }

    public void setOrderRepo(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public String toString() {
        return "ShopService{" +
                "productRepo=" + productRepo +
                ", orderRepo=" + orderRepo +
                '}';
    }

    public void placeOrder(Product orderedProduct, int amount) {
        Order newOrder = new Order(orderedProduct, amount);
        Product foundProduct = productRepo.findProduct(orderedProduct);

        System.out.println(foundProduct);
        System.out.println(newOrder);
        System.out.println(productRepo);

        if (!foundProduct.availability()) {
            System.out.println("Leider sind wir für dein gewünschtes Produkt out of stock");
        } else {
            orderRepo.addOrder(newOrder);

        System.out.println("newOrder: " + newOrder);
        System.out.println("Aktualisiertes orderRepo: " + orderRepo);

        }
    }
}
