package Package1;

public class CricketPlayer {
    // Properties
    private String name;
    public int age;
    protected String team;

    // Constructors
    public CricketPlayer() {
        this.name = "Unknown";
        this.age = 0;
        this.team = "No Team";
    }

    public CricketPlayer(String name, int age, String team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

    // Method
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Team: " + team);
    }

    // Static Method
    public static void showInfo() {
        System.out.println("Cricket Player Information");
    }
}
