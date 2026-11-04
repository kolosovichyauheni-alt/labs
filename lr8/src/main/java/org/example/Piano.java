package org.example;
public class Piano extends Instrument {
    private int keys;

    public Piano(String name, String type, String sound, int keys) {
        super(name, type, sound);
        this.keys = keys;
    }

    public void play() {
        System.out.println(getName() + " - Клавишный звук");
    }

    public void playChord() {
        System.out.println("Играем аккорд на " + keys + " клавишах");
    }

    public int getKeys() { return keys; }
    public void setKeys(int keys) { this.keys = keys; }

    public void DisplayInfo(String name,String Type,String Sound,int keys){
        super.displayInfo();


        System.out.println(super.name);


        System.out.println(keys);
    }
}