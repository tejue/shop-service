package org.example;

public class Main {
    public static void main(String[] args) {


        Product product1 = new Product("milk", 1.33, true);
        Product product2 = new Product("butter", 2.33, false);
        Product product3 = new Product("yoghurt", 3.33, true);
        Product product4 = new Product("milk", 1.33, true);

        ProductRepo productRepo = new ProductRepo();

        System.out.println(productRepo);
        productRepo.addProduct(product1);
        productRepo.addProduct(product2);
        productRepo.addProduct(product3);
        productRepo.addProduct(product4);
        System.out.println(productRepo);

        Order order1 = new Order(product1, 3);
        System.out.println(order1);

        productRepo.findProduct();
        productRepo.removeProduct(product1);
        System.out.println(productRepo);


    }

}