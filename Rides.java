//Caleb Alexandre
public class Rides {
    
    //Instance variables
    private String name;
    private String color;
    private int people;
    private boolean open;

    //Constructors
    public Rides(String n, String c) {
        name = n;
        color = c;
        open = true;
        people = 0;
    }
    public Rides(String n, String c, int p) {
        name = n;
        color = c;
        open = true;
        people = p;
    }

    //Get methods
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public int getPeople() {
        return people;
    }
    

    //Set methods
    public void setName(String a) {
        name = a;
    }
    public void setColor(String c) {
        color = c;
    }
    
    //Other variables
    public void shutDown() {            //The ride is being shut down
        open = false;
    }
    public void isOpen() {              //Checks if the ride is open or shut down
        if(open) {
            System.out.println("This ride is currently operating");
        }
        else {
            System.out.println("This ride has been shut down");
        }
    }
    public void ride(int n) {           //Adds to the total number of people who have been on the ride
        if(open) {
            people += n;
        }
    }
    
    public String toString() {
        if (open) {
            return "The name of this " + color + " ride is " + name + " and " + people + " people have gone on the ride. It is open.";
        }
        return "The name of this " + color + " ride is " + name + " and " + people + " people have gone on the ride. It is shut down.";
    }

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
}