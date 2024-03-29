package Package2;

public class PlayerImplementation implements CricketInterface {
    // Implementing method to get player name
    @Override
    public String getPlayerName() {
        // You can implement the method body here
        return "Virat Kohli";
    }

    // Implementing method to display player statistics
    @Override
    public void displayPlayerStats() {
        // You can implement the method body here
        System.out.println("Virat Kohli - Batting Average: 59.07, Strike Rate: 93.17");
    }
}
