package org.example;

public class Main {
    public static void main(String[] args) {

        Playable[] instruments = {
                new Guitar("Fender", 6, 3.5),
                new Guitar("Yamaha", 6, 4.0),
                new Guitar("Gibson", 6, 3.8),
                new Piano("Casio", 88, 25.0),
                new Piano("Roland", 76, 20.0)
        };

        Playable.playLoud();

        for (Playable p : instruments) {
            p.tune();
            p.play();
            Portable port = (Portable) p;
            System.out.println("Вес: " + port.getWeight() + " кг");
            port.carry();
            System.out.println("-------");
        }
    }
}