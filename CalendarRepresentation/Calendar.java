import java.io.IOException;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Calendar {
    public static void main(String[] args) {
        Event party = new Event("Fun Party", "2016-03-03 22:00", "French Quarter", "It's Mardi Gras");
        Event test = new Event("CSCI Party", "2016-03-03 22:00", "UNO", "Because Rocket League");
        ArrayList<Event> eventList = new ArrayList<>();
        eventList.add(party);
        eventList.add(test);

        // Writing individual Event objects to file
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("eventFile.ser"))) {
            output.writeObject(party);
            output.writeObject(test);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Writing ArrayList<Event> object to file
        try (ObjectOutputStream outputList = new ObjectOutputStream(new FileOutputStream("eventListFile.ser"))) {
            outputList.writeObject(eventList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading individual Event objects from file
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("eventFile.ser"))) {
            while (true) {
                Event event = (Event) input.readObject();
                System.out.println(event);
            }
        } catch (EOFException e) {
            System.out.println("Reached end of file.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        eventList = null; // Set eventList to null to demonstrate it's empty

        System.out.println(eventList); // Print null to show it's empty

        // Reading ArrayList<Event> object from file
        try (ObjectInputStream inputList = new ObjectInputStream(new FileInputStream("eventListFile.ser"))) {
            ArrayList<Event> deserializedList = (ArrayList<Event>) inputList.readObject();
            for (Event event : deserializedList) {
                System.out.println(event);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
