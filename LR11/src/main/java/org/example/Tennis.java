package org.example;

public class Tennis extends Sport {
    private String surface;

    public Tennis(String name, int players, int duration, String surface) {
        super(name, players, duration);
        this.surface = surface;
    }

    @Override
    public String getRules() {
        return "1 или 2 игрока";
    }

    public void play(String opponent, boolean doubles) {
        System.out.println("Играю против " + opponent + " (" + (doubles ? "парами" : "одиночка") + ")");
    }

    public void play(int sets) {
        System.out.println("Играю матч из " + sets + " сетов");
    }
}