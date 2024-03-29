package Package2;

import java.io.*;

public class SecondApp {
    public static void main(String[] args) {
        try {
            // Creating an instance of PlayerImplementation
            PlayerImplementation player = new PlayerImplementation();

            // Calling the implemented methods
            String playerName = player.getPlayerName();
            System.out.println("Player Name: " + playerName);

            player.displayPlayerStats();

            // Writing to file
            FileWriter writer = new FileWriter("player_details.txt");
            writer.write("Player Name: " + playerName + "\n");
            writer.write("Statistics: Batting Average: 59.07, Strike Rate: 93.17");
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
