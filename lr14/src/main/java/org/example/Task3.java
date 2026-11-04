package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();

        try (FileWriter f = new FileWriter("f.txt");
             FileWriter g = new FileWriter("g.txt");
             FileWriter h = new FileWriter("h.txt")) {

            for (int i = 0; i < 10; i++) {
                int num = rand.nextInt(1000) - 100; // От -100 до 899
                f.write(num + "\n");

                if (num >= 100 && num <= 999) {
                    g.write(num + "\n");
                } else {
                    h.write(num + "\n");
                }
            }
            System.out.println("Файлы f, g, h успешно созданы.");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}