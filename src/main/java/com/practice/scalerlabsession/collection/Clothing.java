package com.practice.scalerlabsession.collection;

public class Clothing extends Item{
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    private String size;

    public Clothing(String id, String name, double price, int quantity, String size) {
        super(id, name, price, quantity);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size='" + size + '\'' +
                '}';
    }
}
