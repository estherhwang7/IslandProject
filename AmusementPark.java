import java.util.ArrayList;

public class AmusementPark {
    // Instance variables
    private String name;
    private ArrayList<Rides> rides;
    private double totalRevenue;

    // Constructor
    public AmusementPark(String name) {
        this.name = name;
        this.rides = new ArrayList<>();
        totalRevenue = 0;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public ArrayList<Rides> getRides() {
        return rides;
    }

    // Method to add a ride to the park
    public void addRide(Rides ride) {
        rides.add(ride);
    }

    // Method to display information about the park and its rides
    public void displayInfo() {
        System.out.println("Park Name: " + name);
        System.out.println("Rides in the Park:");
        for (Rides ride : rides) {
            System.out.println(ride);
        }
    }

    // Method to calculate total revenue for the park
    public double calculateTotalRevenue() {
        totalRevenue = 0;
        for (Rides ride : rides) {
            totalRevenue += ride.calculateProfit();
        }
        return totalRevenue;
    }

    // toString method
    public String toString() {
        return "Amusement Park: " + name;
    }
}
