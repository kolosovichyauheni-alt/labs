package org.example;

public class Guitar extends Instrument {
    private int strings;

    public Guitar(String name, String type, double price, int strings) {
        super(name, type, price);
        this.strings = strings;
    }

    public void play() {
        System.out.println("Издает струнный звук");
    }

    public void tune() {
        System.out.println("Настраивается с помощью тюнера");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Струны: " + strings);
    }

    public int getStrings() { return strings; }
    public void setStrings(int strings) { this.strings = strings; }
}