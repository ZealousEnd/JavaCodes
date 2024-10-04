/**
 *This class is for BONUS 1, it creates a file of the database and can serialize or deserialize it!
 *
 * @author Lorelei Alcazar
 */
import java.io.*;

public class StudentDatabaseSerializer {
    private static final String FILENAME = "student_database.ser";

    /**
     * This method serializes the database to disk.
     * @param database The database to be serialized.
     */
    public static void serialize(StudentDatabase database) {
        try (FileOutputStream fileOut = new FileOutputStream(FILENAME);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(database);
            System.out.println("Database serialized.");
        } catch (IOException e) {
            System.out.println("Could not serialize: " + e.getMessage());
        }
    }

    /**
     * This method deserializes the database from disk.
     * @return The deserialized database.
     */
    public static StudentDatabase deserialize() {
        StudentDatabase database = null;
        try (FileInputStream fileIn = new FileInputStream(FILENAME);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            database = (StudentDatabase) objectIn.readObject();
            System.out.println("Database was deserialized.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Cannot deserialize: " + e.getMessage());
        }
        return database;
    }
}
