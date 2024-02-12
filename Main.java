public class Main {
    public static void main(String[] args) {
        // Creating rides
        Rides ferrisWheel = new Rides("Ferris Wheel", "green", 50, 5.0);
        Rides carousel = new Rides("Carousel", "blue", 40, 4.0);

        // Selling tickets for rides
        ferrisWheel.sellTickets(20);
        carousel.sellTickets(30);

        // Displaying information for rides
        System.out.println("Information for Rides:");
        System.out.println(ferrisWheel);
        System.out.println(carousel);

        // Creating amusement parks
        AmusementPark park1 = new AmusementPark("Adventure Park");
        AmusementPark park2 = new AmusementPark("Fantasy Park");

        // Adding rides to parks
        park1.addRide(ferrisWheel);
        park2.addRide(carousel);

        // Displaying information for amusement parks
        System.out.println("\nInformation for Amusement Parks:");
        park1.displayInfo();
        park2.displayInfo();

        // Creating island
        Island island = new Island("Dream Island");

        // Adding parks to island
        island.addPark(park1);
        island.addPark(park2);

        // Displaying information for the island
        System.out.println("\nInformation for Island:");
        island.displayInfo();

        // Calculating total profit for the island
        double totalProfit = island.calculateTotalProfit();
        System.out.println("\nTotal Profit for Island: $" + totalProfit);
    }
}
