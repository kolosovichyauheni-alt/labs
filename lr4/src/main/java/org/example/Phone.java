package org.example;

public class Phone {
    private String brand;
    private String model;
    private double price;

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void applyDiscount(double discount) {
        price = price - price * discount;
    }

    @Override
    public String toString() {
        return brand + " " + model + " — " + price;
    }

    public static void main(String[] args) {
        Phone phone = new Phone("Samsung", "Galaxy S24", 1000.0);
        phone.applyDiscount(0.15);
        System.out.println("Новая цена: " + phone.price);
        System.out.println(phone);
    }
}