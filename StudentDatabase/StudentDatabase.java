/**
 *This class represents a database to hold Student objects using a linkedlist. It contains methods to add and remove students, get their index, search via id number, and print the entire database.
 * @author Lorelei Alcazar
 */
import java.io.Serializable;
import java.util.LinkedList;

public class StudentDatabase implements Serializable{
    private static final long serializationID = 1L;
    private LinkedList<Student> studentsOrganized;

    /**
    *This is the constructor, it builds a new LinkedList called studentsOrganized.
    */
    public StudentDatabase() {
        studentsOrganized = new LinkedList<>();
    }

    /**
    * @param student The student to add to the database.
    *This is the method used to add students to the database. It takes in a student object and adds it to the linkedlist.
    */
    public void addStudents(Student student) {
        studentsOrganized.add(student);
    }

    /**
    * @param index the index of the student wished to be removed.
    *This is the method used to remove students from the database. It takes in the index of the student and then deletes it from the linkedlist.
    */
    public void removeStudents(int index) {
        studentsOrganized.remove(index);
    }

    /**
    * @param index the index of the student that will be returned
    *This method takes in the index of a student and then print the student in that location.
    * @return The student located at that index.
    */
    public Student getStudent(int index) {
        return studentsOrganized.get(index);
    }

    /**
    * @param studentID the ID number of the student to be searched
    *This method searches the database for an index with the entered student id. It there is none it returns nothing.
    * @return Either the index of the student searched or nothing if it isn't found.
    */
    public int indexOf(int studentID) {
        for (int i = 0; i < studentsOrganized.size(); i++) {
            if (studentsOrganized.get(i).getStudentID() == studentID) {
                return i;
            }
        }
        return -1;
    }

    /**
    *This method iterates through each index and prints out the student, resulting in the printint of the entire database.
    */
    public void printDatabase() {
        System.out.println("Printing all students in the database:");
        for (Student student : studentsOrganized) {
            System.out.println(student.toString());
        }
    }

    /**
     * This method is used by StudentDatabaseCSV in order to access the database.
     * @return the database
     */
    public LinkedList<Student> getStudents() {
    return studentsOrganized;
}

}