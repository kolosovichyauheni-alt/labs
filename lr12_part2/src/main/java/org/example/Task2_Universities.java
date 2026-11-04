package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task2_Universities {
    public static void main(String[] args) {
        List<University> universities = new ArrayList<>();

        universities.add(new University(1, "БГУ", "Беларусь", 5, Arrays.asList(5, 4, 5, 4)));
        universities.add(new University(7, "ГУ", "Беларусь", 5, Arrays.asList(5, 4, 5, 4)));

        universities.add(new University(2, "БГУИР", "Беларусь", 4, Arrays.asList(3, 3, 4, 2)));
        universities.add(new University(3, "МГИМО", "Россия", 2, Arrays.asList(2, 1, 3, 2)));
        universities.add(new University(4, "Оксфорд", "США", 5, Arrays.asList(5, 5, 5, 4)));
        universities.add(new University(5, "Кембридж", "Британия", 4, Arrays.asList(4, 4, 4, 4)));
        universities.add(new University(6, "АБВГД", "Германия", 1, Arrays.asList(1, 2, 1, 2)));

        System.out.println("нач список ");
        for (University u : universities) {
            System.out.println(u);
        }

        System.out.println("\n университеты ср рейт < 3 ");
        for (University u : universities) {
            if (u.getAverageRating() < 3) {
                System.out.println(u);
            }
        }

        for (University u : universities) {
            if (u.getAverageRating() >= 4) {
                u.setRank(Math.min(5, u.getRank() + 1));
            }
        }
        System.out.println("\n после повышения ранга (ср рейт >= 4) ");
        for (University u : universities) {
            System.out.println(u);
        }

        printUniversities(universities, 5);

        System.out.println("\n=сортировка");
        universities.sort(new Comparator<University>() {
            @Override
            public int compare(University u1, University u2) {
                int cmp = Double.compare(u1.getAverageRating(), u2.getAverageRating());
                if (cmp != 0) return cmp;
                return u2.getName().compareTo(u1.getName());
            }
        });

        for (University u : universities) {
            System.out.println("ID: " + u.getId() + " | Name: " + u.getName() + " | Avg Rating: " + u.getAverageRating());
        }
    }
    public static void printUniversities(List<University> universities, int rank) {
        System.out.println("\n университеты с рангом " + rank + " ");
        for (University u : universities) {
            if (u.getRank() == rank) {
                System.out.println(u);
            }
        }
    }
}