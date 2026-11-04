public class Restaurant {
    private String name;
    private String cuisine;
    private double rating;

    private static int totalRestaurants = 0;
    private static double totalRating = 0;

    public Restaurant(String name, String cuisine, double rating) {
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
        totalRestaurants++;
        totalRating += rating;
    }

    public static double getAverageRating() {
        if (totalRestaurants == 0) return 0;
        return totalRating / totalRestaurants;
    }

    public String getName() { return name; }
    public String getCuisine() { return cuisine; }
    public double getRating() { return rating; }

     public static void Exit(){

        System.out.println(totalRating);
        System.out.println(totalRestaurants);
     }

    public static void main(String[] args) {
        new Restaurant("A", "итальянская", 4.5);
        new Restaurant("B", "японская", 4.0);
        new Restaurant("C", "русская", 3.5);
        new Restaurant("D", "французская", 5.0);

        System.out.println(Restaurant.getAverageRating());
        Exit();
    }
}