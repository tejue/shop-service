package org.example;

public class ShopService {
    private ProductRepo productRepo;
    private OrderListRepo orderListRepo;
    private DoOrderRepo doOrderRepo;
    // CONSTRUCTOR

    public ShopService() {
    }

    public ShopService(ProductRepo productRepo, OrderListRepo orderListRepo) {
        this.productRepo = productRepo;
        this.orderListRepo = orderListRepo;
    }

    public ShopService(ProductRepo productRepo, DoOrderRepo doOrderRepo) {
        this.productRepo = productRepo;
        this.doOrderRepo = doOrderRepo;
    }

    public ProductRepo getProductRepo() {
        return productRepo;
    }

    public void setProductRepo(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public OrderListRepo getOrderListRepo() {
        return orderListRepo;
    }

    public void setOrderListRepo(OrderListRepo orderListRepo) {
        this.orderListRepo = orderListRepo;
    }

    @Override
    public String toString() {
        return "ShopService{" +
                "productRepo=" + productRepo +
                ", orderRepo=" + orderListRepo +
                '}';
    }

    public void placeOrder(Product orderedProduct, int amount, int orderID) {
        Order newOrder = new Order(orderedProduct, amount, orderID);
        Product foundProduct = productRepo.findProduct(orderedProduct);

        System.out.println(foundProduct);
        System.out.println(newOrder);
        System.out.println(productRepo);

        if (foundProduct == orderedProduct) {

            orderListRepo.addOrder(newOrder);
        } else {
            System.out.println("Leider sind wir für dein gewünschtes Produkt out of stock");
        }


        System.out.println("newOrder: " + newOrder);
        System.out.println("Aktualisiertes orderRepo: " + orderListRepo);

    }
}

