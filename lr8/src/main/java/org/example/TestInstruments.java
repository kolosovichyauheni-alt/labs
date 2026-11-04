package org.example;
public class TestInstruments {
    public static void main(String[] args) {
        Guitar fender = new Guitar("Fender", "струнный", "дзынь", 6);
        Guitar gibson = new Guitar("Gibson", "струнный", "брень", 6);
        Guitar bass = new Guitar("Bass", "струнный", "бум", 4);
        Piano yamaha = new Piano("Yamaha", "клавишный", "пилинь", 88);
        Piano casio = new Piano("Casio", "клавишный", "дон", 61);

        Instrument[] instruments = new Instrument[5];
        instruments[0] = fender;
        instruments[1] = gibson;
        instruments[2] = bass;
        instruments[3] = yamaha;
        instruments[4] = casio;

        for (int i = 0; i < instruments.length; i++) {
            instruments[i].displayInfo();
            instruments[i].play();
        }

        fender.tune();
        gibson.tune();
        bass.tune();
        yamaha.playChord();
        casio.playChord();
    }
}