package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Order o1 = new Order("1", "Иван", 100.0, "Книга");
            Order o2 = new Order("2", "Петр", 200.0, "Ручка");

            o1.processOrder();

            try {
                o1.cancelOrder();
            } catch (OrderProcessingException e) {
                System.out.println(e.getMessage());
            }

            o2.cancelOrder();

            try {
                o2.processOrder();
            } catch (OrderProcessingException e) {
                System.out.println(e.getMessage());
            }

            try {
                new Order("3", "", 50.0, "Товар");
            } catch (InvalidOrderDataException e) {
                System.out.println(e.getMessage());
            }

            findOrder("99");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void findOrder(String id) throws OrderNotFoundException {
        if (!id.equals("1") && !id.equals("2")) {
            throw new OrderNotFoundException("Заказ с ID " + id + " не найден.");
        }
    }
}