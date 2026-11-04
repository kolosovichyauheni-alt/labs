package org.example;


public class Order {
    private String orderId;
    private String customerName;
    private double totalAmount;
    private String status;
    private String items;

    public Order(String orderId, String customerName, double totalAmount, String items) throws InvalidOrderDataException {
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new InvalidOrderDataException("Имя клиента не может быть пустым.");
        }
        if (totalAmount <= 0) {
            throw new InvalidOrderDataException("Сумма заказа должна быть больше нуля.");
        }
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.items = items;
        this.status = "New";
    }

    public void processOrder() throws OrderProcessingException {
        if (status.equals("Cancelled")) {
            throw new OrderProcessingException("Невозможно обработать отмененный заказ.");
        }
        if (status.equals("Processed")) {
            throw new OrderProcessingException("Заказ уже обработан.");
        }
        this.status = "Processed";
        System.out.println("Заказ " + orderId + " обработан.");
    }

    public void cancelOrder() throws OrderProcessingException {
        if (status.equals("Processed")) {
            throw new OrderProcessingException("Невозможно отменить обработанный заказ.");
        }
        if (status.equals("Cancelled")) {
            throw new OrderProcessingException("Заказ уже отменен.");
        }
        this.status = "Cancelled";
        System.out.println("Заказ " + orderId + " отменен.");
    }

    public String getOrderId() {
        return orderId;
    }
}