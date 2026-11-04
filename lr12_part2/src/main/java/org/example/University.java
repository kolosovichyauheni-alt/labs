package org.example;

import java.util.List;

public class University {
    private int id;
    private String name;
    private String country;
    private int rank;
    private List<Integer> studentRatings;

    public University(int id, String name, String country, int rank, List<Integer> studentRatings) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.rank = rank;
        this.studentRatings = studentRatings;
    }

    public double getAverageRating() {
        if (studentRatings == null || studentRatings.isEmpty()) return 0;
        double sum = 0;
        for (int r : studentRatings) {
            sum += r;
        }
        return sum / studentRatings.size();
    }

    public int getRank() { return rank; }
    public void setRank(int rank) { this.rank = rank; }
    public int getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Rank: " + rank + ", Avg Rating: " + getAverageRating();
    }
}