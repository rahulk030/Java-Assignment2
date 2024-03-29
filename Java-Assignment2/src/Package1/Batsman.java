package Package1;

public class Batsman extends CricketPlayer {
    // Constructor
    public Batsman() {
        super();
    }

    // Override Method
    @Override
    public void displayDetails() {
        super.displayDetails(); // calling superclass method
        System.out.println("Role: Batsman");
    }
}
