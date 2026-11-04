package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        try (FileWriter writer = new FileWriter("mass.txt")) {
            System.out.println("Введите 12 значений массы тела (через Enter):");
            for (int i = 0; i < 12; i++) {
                double val = sc.nextDouble();
                sum += val;
                writer.write(val + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("Средняя масса тела: " + (sum / 12));
    }
}