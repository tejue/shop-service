package org.example;

public class Main {
    public static void main(String[] args) {

        // PRODUCTS

        System.out.println("------- PRODUCTS -------");
        Product product1 = new Product("milk", 1.33, true, 1);
        Product product2 = new Product("butter", 2.33, false, 2);
        Product product3 = new Product("yoghurt", 3.33, true, 3);
        Product product4 = new Product("juice", 1.33, true, 4);

        ProductRepo productRepo = new ProductRepo();

        System.out.println("Leeres ProductRepo: " + productRepo);
        productRepo.addProduct(product1);
        productRepo.addProduct(product2);
        productRepo.addProduct(product3);
        productRepo.addProduct(product4);
        System.out.println("Gefülltes ProduktRepo: " + productRepo);

        System.out.println("Finde ein Produkt mit get-Methode: " + productRepo.queryProduct(2));
        System.out.println("Finde ein Produkt mit for-each-Schleife: " + productRepo.findProduct(product3));

        productRepo.removeProduct(product1);
        System.out.println("Lösche ein Produkt: " + productRepo);

        // ORDERS

        System.out.println("------- ORDERS -------");

        Order order1 = new Order(product1, 3, 1);
        Order order2 = new Order(product2, 1, 2);
        Order order3 = new Order(product1, 2, 3);
        Order order4 = new Order(product4, 5, 4);
        System.out.println("1. Bestellung: " + order1);

        // ORDERS VIA LIST

        OrderListRepo orderListRepo = new OrderListRepo();

        System.out.println("Leeres OrderRepo: " + orderListRepo);
        orderListRepo.addOrder(order1);
        orderListRepo.addOrder(order2);
        orderListRepo.addOrder(order3);
        orderListRepo.addOrder(order4);
        System.out.println("Gefülltes OrderRepo: " + orderListRepo);

        System.out.println("Finde eine Bestellung: " + orderListRepo.findOrder(order3));

        orderListRepo.removeOrder(order1);
        System.out.println("Lösche eine Bestellung: " + orderListRepo);

        // SHOP-SERVICES

        System.out.println("------- SHOP-SERVICES -------");

        ShopService shopService = new ShopService(productRepo, orderListRepo);

        shopService.placeOrder(order4.product(), order4.amount(), order4.orderID());

        // ORDERS VIA MAP
        DoOrderRepo orderMapRepoWithInterface = new OrderMapRepo();
        ShopService newShopService = new ShopService(productRepo, orderMapRepoWithInterface);
    //newShopService.placeOrder(order4);
    }

}