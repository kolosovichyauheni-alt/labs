package org.example;

public class Task2 {
    public static void main(String[] args) {
        Laptop[] laptops = new Laptop[6];
        laptops[0] = new Laptop("Asus", 8, 500);
        laptops[1] = new Laptop("Lenovo", 16, 700);
        laptops[2] = new Laptop("Apple", 32, 2500);
        laptops[3] = new Laptop("HP", 8, 450);
        laptops[4] = new Laptop("Dell", 16, 1200);
        laptops[5] = new Laptop("Acer", 4, 300);

        Laptop maxRamLaptop = laptops[0];
        Laptop maxPriceLaptop = laptops[0];

        for (Laptop l : laptops) {
            if (l.ram > maxRamLaptop.ram) maxRamLaptop = l;
            if (l.price > maxPriceLaptop.price) maxPriceLaptop = l;
        }

        System.out.println("Максимальный объем RAM: " + maxRamLaptop.brand + " (" + maxRamLaptop.ram + " GB)");
        System.out.println("Самый дорогой: " + maxPriceLaptop.brand + " (" + maxPriceLaptop.price + ")");
    }
}
