package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 0;

        try (FileWriter f = new FileWriter("f.txt")) {
            for (int i = 0; i < 10; i++) {
                int num = rand.nextInt(100); // Случайные от 0 до 99
                f.write(num + "\n");

                if (num % 10 == 5 || num % 10 == -5) {
                    count++;
                }
            }
            System.out.println("Данные записаны в файл.");
            System.out.println("Количество чисел, оканчивающихся на 5: " + count);
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}