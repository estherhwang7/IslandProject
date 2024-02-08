public class Rides {
    private int name;
    private int seats;
    private String color;
    private boolean open;

    public Rides(int n, int s, String c, boolean o) {
        name = n;
        seats = s;
        color = c;
        open = o;
    }

    //Get methods
    public int getName() {
        return name;
    }
    public int getSeats() {
        return seats;
    }
    public String getColor() {
        return color;
    }
    public boolean getOpen() {
        return open;
    }

    //Set methods
    public void setName(int a) {
        name = a;
    }
    public void setSeats(int b) {
        seats = b;
    }
    public void setColor(String c) {
        color = c;
    }
    public void setOpen(boolean o) {
        open = o;
    }

    public String toString() {
        if (open) {
            return "The name of this " + color + " ride is " + name + ", it holds " + seats + " people, and it is open.";
        }
        return "The name of this " + color + " ride is " + name + ", it holds " + seats + " people, and it is closed.";
    }
    
}