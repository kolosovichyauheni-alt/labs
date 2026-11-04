package org.example;
public class Guitar extends Instrument {
    private int strings;

    public Guitar(String name, String type, String sound, int strings) {
        super(name, type, sound);
        this.strings = strings;
    }

    public void play() {
        System.out.println(getName() + " - Струнный звук");
    }

    public void tune() {
        System.out.println("Настраиваем " + strings + " струн");
    }

    public int getStrings() { return strings; }
    public void setStrings(int strings) { this.strings = strings; }
}