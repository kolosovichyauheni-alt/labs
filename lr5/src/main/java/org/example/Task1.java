package org.example;

public class Task1 {
    public static void main(String[] args) {
        Phone phone = new Phone("Samsung", "Galaxy S23", 1000.0);
        phone.displayInfo();
        phone.applyDiscount(15);
        phone.displayInfo();
    }
}
