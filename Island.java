import java.util.ArrayList;

public class Island {
    // Instance variables
    private String name;
    private ArrayList<AmusementPark> parks;

    // Constructor
    public Island(String name) {
        this.name = name;
        this.parks = new ArrayList<>();
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public ArrayList<AmusementPark> getParks() {
        return parks;
    }

    // Method to add a park to the island
    public void addPark(AmusementPark park) {
        parks.add(park);
    }

    // Method to display information about the island and its parks
    public void displayInfo() {
        System.out.println("Island Name: " + name);
        System.out.println("Parks on the Island:");
        for (AmusementPark park : parks) {
            System.out.println(park.getName());
        }
    }

    // Method to calculate total profit for the island
    public double calculateTotalProfit() {
        double totalProfit = 0;
        for (AmusementPark park : parks) {
            totalProfit += park.calculateTotalRevenue();
        }
        return totalProfit;
    }

    // toString method
    public String toString() {
        return "Island: " + name;
    }
}
