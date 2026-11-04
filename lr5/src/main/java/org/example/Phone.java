package org.example;

public class Phone {
    String brand;
    String model;
    double price;

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void applyDiscount(double discount) {
        price = price - (price * discount / 100);
    }

    public void displayInfo() {
        System.out.println(brand + " " + model + ", цена: " + price);
    }
}
