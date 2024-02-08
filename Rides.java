public class Rides {
    
    //Instance variables
    private String name;
    private String color;
    private int customers;
    private boolean open;

    //Constructors
    public Rides(String n, int s, String c) {
        name = n;
        color = c;
        open = true;
        customers = 0;
    }

    //Get methods
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public boolean getOpen() {
        return open;
    }

    //Set methods
    public void setName(String a) {
        name = a;
    }
    public void setColor(String c) {
        color = c;
    }
    
    //Other variables
    public void shutDown() {            //the ride being shut down
        open = false;
    }
    public void ride(int n) {           //people going on the ride
        if(open) {
            customers += n;
        }
    }

    public String toString() {
        if (open) {
            return "The name of this " + color + " ride is " + name + "and " + customers + " people have gone on the ride. It is open.";
        }
        return "The name of this " + color + " ride is " + name + " and " + customers + " people have gone on the ride. It is shut down.";
    }
    
}