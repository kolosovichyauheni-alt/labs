package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        try (FileWriter writer = new FileWriter("f.txt")) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                numbers[i] = sc.nextInt();
                writer.write(numbers[i] + "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        int sum = 0;
        System.out.print("Введенные числа: ");
        for (int num : numbers) {
            System.out.print(num + " ");
            sum += num;
        }
        System.out.println();

        double avg = (double) sum / 10;
        int count = 0;
        for (int num : numbers) {
            if (num > avg) count++;
        }

        System.out.println("Среднее арифметическое: " + avg);
        System.out.println("Количество чисел больше среднего: " + count);
    }
}