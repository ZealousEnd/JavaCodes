import java.io.*;

public class CartoonCharacterSerializer {
    
    private static final String FILENAME = "cartoon_character.ser";

    public static void serializeCharacter(CartoonCharacter character) {
        try (ObjectOutputStream outputCartoon = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            outputCartoon.writeObject(character);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static CartoonCharacter deserializeCharacter() {
        try (ObjectInputStream inputCartoon = new ObjectInputStream(new FileInputStream(FILENAME))) {
            return (CartoonCharacter) inputCartoon.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void printToFile(String stringToFile) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME, true))) {
            writer.println(stringToFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
