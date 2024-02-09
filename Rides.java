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
    public void ride(int n) {           //Adds to the total number of people that have been on the ride
        if(open) {
            people += n;
        }
    }
    public void isOpen() {
        if(open) {
            System.out.println("This ride is open");
        }
        else {
            System.out.println("Thi ride as been shut down");
        }
    }

    public String toString() {
        if (open) {
            return "The name of this " + color + " ride is " + name + "and " + people + " people have gone on the ride. It is open.";
        }
        return "The name of this " + color + " ride is " + name + " and " + people + " people have gone on the ride. It is shut down.";
    }
    
}