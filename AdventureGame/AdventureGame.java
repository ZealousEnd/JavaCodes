import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AdventureGame implements Serializable
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Dungeon dungeon = null;
        Config config = null;
        GameTUI tui = null;

        // Check for the save file directly using a path, ensure it's not just the file existence but also readability
        File saveFile = new File("SavedGame.dat");
        if (saveFile.exists() && saveFile.canRead()) {
            System.out.println("Found saved game. Do you want to load it? (yes/no)");
            String response = scanner.nextLine();
            while (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
                response = scanner.nextLine();
            }
            if (response.equalsIgnoreCase("yes")) {
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(saveFile))) {
                    dungeon = (Dungeon) ois.readObject();
                    config = new ConfigASCII(); 
                    tui = new GameTUI(config, dungeon);
                    tui.run();
                    return;
                } catch (IOException | ClassNotFoundException e) {
                    System.out.println("Failed to load the saved game. Error: " + e.getMessage() + ". Starting a new game.");
                }
            }
            else {
                System.out.println("Please delete save file and then reload the program!");
                System.exit(0);
            }
        }
        else {
                // Initiate a new game setup if no saved game is loaded
                if (dungeon == null || config == null) {
                    String systemSettings = "";
                            for (String specification : args)
                            {
                                systemSettings+= specification;
                            }
                            //Call to factory class to construct the correct config object for us.
                            config = ConfigFactory.createConfig(systemSettings);
                            
                            //Read in the size of the map
                            int width = StdIn.readInt();
                            int height = StdIn.readInt();
                            
                            //Construct the dungeon layout
                            dungeon = new Dungeon(config, width, height);
                            
                            //Read in the initial location of the hero
                            //#TODO add which room the hero starts in
                            int heroX = StdIn.readInt();
                            int heroY = StdIn.readInt();
                            Hero hero = new Hero(config, heroX, heroY);
                            dungeon.addHero(hero);
                            
                            //Setup all the cells in the dungeon
                            for (int y=0; y<height; y++)
                            {
                                for (int x=0; x<width; x++)
                                {
                                    dungeon.set(x, y, StdIn.readString());
                                }//end inner-for
                            }//end outer-for
                            
                            //#TODO read item string, change param for STRING, parse from map 
                            dungeon.addItem(Item.KEY,1,1);
                            dungeon.addMonster(new Monster(config,1,2));
                            dungeon.addMonster(new Monster(config,1,3));
                            dungeon.addMonster(new Monster(config,10,8));

                            tui = new GameTUI(config,dungeon);
                            tui.run();

                    }
                scanner.close();
        }
    }
}



