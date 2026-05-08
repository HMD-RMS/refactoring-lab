package com.example;
import java.util.List;

public class OrderProcessor {
    public void printOrderSummary(Order order) {
        // Calculate total price
        double totalPrice = 0;
        for (Item item : order.getItems()) {
            totalPrice += item.getPrice() * item.getQuantity();
        }

        // Apply discount
        if (order.getCustomer().isMember()) {
            totalPrice *= 0.9; // 10% discount for members
        }

        // Print summary
        System.out.println("Order Summary:");
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Items:");
        for (Item item : order.getItems()) {
            System.out.println("  - " + item.getName() + ": " + item.getQuantity() + " x $" + item.getPrice() + " = $" + (item.getQuantity() * item.getPrice()));
        }
        System.out.printf("Total Price: $%.2f%n", totalPrice);
    }

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