package OOPS;
import java.util.*;

public class RestaurantDemo {
    public static void main(String[] args) {
        Restaurant myRestaurant = new Restaurant();

        // Adding menu items
        myRestaurant.addItem("Burger", 150.0, 4.2);
        myRestaurant.addItem("Pizza", 300.0, 4.5);
        myRestaurant.addItem("Pasta", 250.0, 4.0);

        // Removing an item
        myRestaurant.removeItem("Pasta");

        // Calculating and displaying average rating
        double avgRating = myRestaurant.calculateAverageRating();
        System.out.println("Average Rating: " + avgRating);

        // Optional: print current menu
        myRestaurant.printMenu();
    }
}

class Restaurant {
    // Attributes
    private Map<String, Double> menuPrices = new HashMap<>();
    private Map<String, Double> menuRatings = new HashMap<>();

    // Method to add a menu item
    public void addItem(String itemName, double price, double rating) {
        menuPrices.put(itemName, price);
        menuRatings.put(itemName, rating);
        System.out.println(itemName + " added to menu.");
    }

    // Method to remove a menu item
    public void removeItem(String itemName) {
        if (menuPrices.containsKey(itemName)) {
            menuPrices.remove(itemName);
            menuRatings.remove(itemName);
            System.out.println(itemName + " removed from menu.");
        } else {
            System.out.println(itemName + " not found in menu.");
        }
    }

    // Method to calculate average rating
    public double calculateAverageRating() {
        if (menuRatings.isEmpty()) return 0.0;

        double sum = 0.0;
        for (double rating : menuRatings.values()) {
            sum += rating;
        }
        return sum / menuRatings.size();
    }

    // (Optional) Method to print current menu
    public void printMenu() {
        System.out.println("\nCurrent Menu:");
        for (String item : menuPrices.keySet()) {
            System.out.println("- " + item + " : ₹" + menuPrices.get(item) + " | Rating: " + menuRatings.get(item));
        }
    }
}
