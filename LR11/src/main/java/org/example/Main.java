package org.example;

public class Main {
    public static void main(String[] args) {
        Sport sport = new Sport("Общий спорт", 2, 60);
        sport.play();
        sport.play("Динамо");
        sport.play(5);

        Football football = new Football("Футбол", 11, 90, "Динамо");
        football.play();
        football.play("Немига гейм");
        football.play(11);
        football.play("Спирит", "Динамо");
        football.play(22, "Шайхань");

        Tennis tennis = new Tennis("Теннис", 2, 120, "грунт");
        tennis.play();
        tennis.play("Чемпион", false);
        tennis.play(3);

        Sport[] sports = {
                new Sport("Общий спорт", 2, 60),
                new Football("Футбол", 11, 90, "Динамо"),
                new Tennis("Теннис", 2, 120, "грунт")
        };
        for (Sport s : sports) {
            System.out.println(s.getName() + " - " + s.getRules());
        }

        Sport poly = new Football("Футбол-2", 11, 90, "Минск");
        poly.play();
        System.out.println(poly.getRules());
    }
}