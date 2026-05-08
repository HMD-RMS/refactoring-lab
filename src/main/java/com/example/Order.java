package com.example;
import java.util.List;
import java.util.ArrayList;

public class Order {
    private Customer customer;
    private List<Item> items = new ArrayList<>();

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }
}