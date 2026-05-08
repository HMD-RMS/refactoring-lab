package com.example;

public class Main {
    public static void main(String[] args) {
        // Create test data
        Customer customer = new Customer();
        customer.setName("Ahmed");
        customer.setMember(true);

        Order order = new Order();
        order.setCustomer(customer);

        Item item1 = new Item();
        item1.setName("Laptop");
        item1.setPrice(1000);
        item1.setQuantity(1);
        order.addItem(item1);

        Item item2 = new Item();
        item2.setName("Mouse");
        item2.setPrice(50);
        item2.setQuantity(2);
        order.addItem(item2);

        OrderProcessor processor = new OrderProcessor();
        processor.printOrderSummary(order);
    }
}