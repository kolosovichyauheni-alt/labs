package org.example;

public class Piano extends Instrument {
    private int keys;

    public Piano(String name, String type, double price, int keys) {
        super(name, type, price);
        this.keys = keys;
    }

    public void play() {
        System.out.println("Издает клавишный звук");
    }

    public void tune() {
        System.out.println("Настраивается с помощью ключа");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Клавиши: " + keys);
    }

    public int getKeys() { return keys; }
    public void setKeys(int keys) { this.keys = keys; }
}