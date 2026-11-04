import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.printf("Введите номер задания -");
        int b = in.nextInt();

        switch (b) {
            case 1:
                System.out.print("ввердите радиус: ");
                int r = in.nextInt();
                double circ = 2 * Math.PI * r;
                System.out.println("Длина окружности = " + circ);
                break;

            case 2:
                System.out.print("Введите a: ");
                double a = in.nextDouble();

                System.out.print("Введите b: ");
                double b2 = in.nextDouble();

                System.out.print("Введите c: ");
                double c = in.nextDouble();

                double d = b2 * b2 - 4 * a * c;
                System.out.println("Дискриминант = " + d);

                if (d < 0) {
                    System.out.println("Нет корней");
                } else if (d == 0) {
                    double x = -b2 / (2 * a);
                    System.out.println("Один корень: " + x);
                } else {
                    double x1 = (-b2 + Math.sqrt(d)) / (2 * a);
                    double x2 = (-b2 - Math.sqrt(d)) / (2 * a);
                    System.out.println("Корень 1: " + x1);
                    System.out.println("Корень 2: " + x2);
                }
                break;

            case 3:
                System.out.print("введите число: ");
                int k = in.nextInt();
                if (k < 0) {
                    k = -k;
                }
                int sum = 0;
                int count = 0;

                if (k == 0) {
                    System.out.println("cумма цирф равна 0: ");
                } else {
                    while (k > 0) {
                        sum = sum + (k % 10);
                        k = k / 10;
                    }
                }
                System.out.println("cумма цифр: " + sum);
                break;
            default :  System.out.println("введите корректное число 1-3");
        }
    }
}