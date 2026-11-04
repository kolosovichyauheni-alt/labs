package org.example;

public class TestInstruments {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[5];

        instruments[0] = new Guitar("Fender", "струнный", 800, 6);
        instruments[1] = new Guitar("Gibson", "струнный", 1200, 6);
        instruments[2] = new Piano("Yamaha", "клавишный", 1500, 88);
        instruments[3] = new Piano("Casio", "клавишный", 700, 61);
        instruments[4] = new Piano("Roland", "клавишный", 2000, 76);

        for (int i = 0; i < instruments.length; i++) {
            instruments[i].displayInfo();
            instruments[i].tune();
            instruments[i].play();
            System.out.println();
        }


    }
}