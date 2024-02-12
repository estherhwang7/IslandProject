//Caleb Alexandre
import java.util.*;

public class Rides {
    // Instance variables
    private String name;
    private String color;
    private int totalVisitors;
    private int availableSeats;
    private double ticketPrice;
    private boolean open;

    // Constructor
    public Rides(String n, String c, int seats, double price) {
        name = n;
        color = c;
        availableSeats = seats;
        ticketPrice = price;
        totalVisitors = 0;
        open = true;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getTotalVisitors() {
        return totalVisitors;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    // Method to track ride transactions (ticket sales)
    public double sellTickets(int quantity) {
        if (open && quantity <= availableSeats) {
            totalVisitors += quantity;
            availableSeats -= quantity;
            return quantity * ticketPrice;
        } else {
            return 0; // Not enough available seats
        }
    }

    // Method to simulate ride operation (start ride)
    public void startRide() {
        open = true;
    }

    // Method to shut down the ride
    public void shutDown() {
        open = false;
    }

    // Method to check if the ride is open
    public boolean isOpen() {
        return open;
    }

    // Method to calculate profit for the ride
    public double calculateProfit() {
        return totalVisitors * ticketPrice;
    }

    // toString method
    public String toString() {
        String status;
        if (open) {
            status = "open";
        } else {
            status = "closed";
        }
        return "Ride: " + name + ", Color: " + color + ", Status: " + status + ", Total Visitors: " + totalVisitors;
    }
}

    /*
    //Test
    public static void main(String[] args) {
        Rides ferrisWheel = new Rides("Ferris Wheel", "green");
        Rides carousel = new Rides("Carousel", "blue", 40);
        
        System.out.println("Testing toString Method:");
        System.out.println(ferrisWheel);
        System.out.println(carousel);
        ferrisWheel.ride(20);
        carousel.ride(30);
        carousel.shutDown();
        System.out.println(ferrisWheel);
        System.out.println(carousel);
        
        System.out.println("\nTesting isOpen Method:");
        System.out.print("Ferris Wheel: ");
        ferrisWheel.isOpen();
        System.out.print("Carousel: ");
        carousel.isOpen();
    
        System.out.println("\nTesting get Methods:");
        System.out.println("Ferris Wheel name: " + ferrisWheel.getName() + ", color: " + ferrisWheel.getColor() + ", people: " + ferrisWheel.getPeople());
        System.out.println("Carousel name: " + carousel.getName() + ", color: " + carousel.getColor() + ", people: " + carousel.getPeople());

        System.out.println("\nTesting set Methods:");
        ferrisWheel.setColor("purple");
        carousel.setName("Bumper Cars");
        System.out.println("Ferris Wheel new color: " + ferrisWheel.getColor());
        System.out.println("Carousel new name: " + carousel.getName());
        
    }
    */
}