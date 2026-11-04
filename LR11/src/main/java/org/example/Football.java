package org.example;

public class Football extends Sport {
    private String stadium;

    public Football(String name, int players, int duration, String stadium) {
        super(name, players, duration);
        this.stadium = stadium;
    }

    @Override
    public String getRules() {
        return "11 игроков, 2 тайма";
    }

    public void play(String team, String stadium) {
        System.out.println("Играю за " + team + " на стадионе " + stadium);
    }

    public void play(int players, String stadium) {
        System.out.println("Играю с " + players + " игроками на " + stadium);
    }
}