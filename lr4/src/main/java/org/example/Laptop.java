package org.example;

public class Laptop {
    private String brand;
    private int ram;
    private double price;

    public Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() { return brand; }
    public int getRam()      { return ram; }
    public double getPrice() { return price; }



    public static void main(String[] args) {
        Laptop[] laptops = {
                new Laptop("Apple",   16, 2500.0),
                new Laptop("Asus",     8, 1200.0),
                new Laptop("Lenovo",  32, 1800.0),
                new Laptop("HP",      16, 3000.0),
                new Laptop("Dell",    64, 2200.0),
                new Laptop("Acer",     8,  900.0)
        };


        Laptop maxRam = laptops[0];
        for (Laptop l : laptops) {
            if (l.ram > maxRam.ram) {
                maxRam = l;
            }
        }
        Laptop mostExpensive = laptops[0];
        for (Laptop l : laptops) {
            if (l.price > mostExpensive.price) {
                mostExpensive = l;
            }
        }
        System.out.println("Максимум RAM:   " + maxRam.brand);
        System.out.println("Самый дорогой:  " + mostExpensive.brand);
    }
}