package org.example;

import java.util.HashMap;
import java.util.Map;

public class Task1_Computers {
    public static void main(String[] args) {
        Map<String, Computer> computers = new HashMap<>();

        computers.put("MacBook Pro", new Laptop("MacBook Pro", 1, 16, 14.0));
        computers.put("Dell XPS", new Laptop("Dell XPS", 2, 32, 15.6));
        computers.put("Lenovo ThinkPad", new Laptop("Lenovo ThinkPad", 3, 8, 13.3));

        computers.put("iMac", new Desktop("iMac", 4, 16, "Retina 4.5K"));
        computers.put("HP Pavilion", new Desktop("HP Pavilion", 5, 8, "FullHD"));
        computers.put("Custom PC", new Desktop("Custom PC", 6, 64, "4K Ultra"));

        computers.put("Dell PowerEdge", new Server("Dell PowerEdge", 7, 128, 2));
        computers.put("HP ProLiant", new Server("HP ProLiant", 8, 256, 4));

        System.out.println(" список компьютеров ");
        for (Map.Entry<String, Computer> entry : computers.entrySet()) {
            System.out.println("Ключ (Модель): " + entry.getKey() + " | Значение: " + entry.getValue());
        }
    }
}