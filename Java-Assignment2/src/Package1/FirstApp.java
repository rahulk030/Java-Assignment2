package Package1;

import java.io.*;
import java.util.ArrayList;

public class FirstApp {
    public static void main(String[] args) {
        try {
            // Creating instance for superclass
            CricketPlayer player1 = new CricketPlayer("Sachin", 45, "India");

            // Calling methods
            player1.displayDetails();
            CricketPlayer.showInfo();

            // Creating instance for subclass
            Batsman player2 = new Batsman();
            player2.displayDetails();

            // ArrayList demonstration
            ArrayList<String> teams = new ArrayList<>();
            teams.add("India");
            teams.add("Australia");
            teams.add("England");
            System.out.println("Teams: " + teams);

            // Writing to file
            FileWriter writer = new FileWriter("player_details.txt");
            writer.write("Name: Sachin\nAge: 45\nTeam: India");
            writer.close();

            // Reading from file
            FileReader reader = new FileReader("player_details.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
