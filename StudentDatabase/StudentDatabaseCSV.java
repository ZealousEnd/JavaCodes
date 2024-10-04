/**
 *This class is for BONUS 2, it creates a file of the database in CSV and can read a CSV to form a database!
 *
 * @author Lorelei Alcazar
 */
import java.io.*;
import java.util.List;

public class StudentDatabaseCSV {
    private static final String CSV_FILENAME = "student_database.csv";

    /**
    * This method iterates through the list and CSVs each student or displays a message if not.
    *@param database The database to be written as CSV to disk.
    */
    public static void writingCSV(StudentDatabase database) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(CSV_FILENAME))) {
            for (Student student : database.getStudents()) {
                writer.println(studentToCSV(student));
            }
            System.out.println("Database written to CSV.");
        } catch (IOException e) {
            System.out.println("Cannot write database to CSV: " + e.getMessage());
        }
    }

    /**
     * This method reads the file in CSV and creates a database from it or displays a message if not.
     * @return The database from disk.
     */
    public static StudentDatabase readingCSV() {
        StudentDatabase database = new StudentDatabase();
        try (BufferedReader reader = new BufferedReader(new FileReader(CSV_FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Student readStudents = csvToStudent(line);
                database.addStudents(readStudents);
            }
            System.out.println("Database read from disk.");
        } catch (IOException e) {
            System.out.println("Database could not be read from disk: " + e.getMessage());
        }
        return database;
    }

    /**
     * @param student the student that will be written as CSV
     * This method does the actual writing of a student object to CSV.
     * @return The newly built String of a student object in CSV.
     */
    private static String studentToCSV(Student student) {
        StringBuilder builtString = new StringBuilder();
        builtString.append(student.getStudentID()).append(",");
        builtString.append(student.getSex()).append(",");
        builtString.append(student.getEthnicGroup()).append(",");
        return builtString.toString();
    }

    /**
     * @param csv is the string of information that will be passed into a Student object.
     * This method reads each CSV and creates a student object from it.
     * @return The new Student object built from the given CSV.
     */
    private static Student csvToStudent(String csv) {
        String[] individualAspects = csv.split(",");
        Student newStudent = new Student();
        newStudent.setStudentID(Integer.parseInt(individualAspects[0]));
        newStudent.setSex(individualAspects[1]);
        newStudent.setEthnicGroup(individualAspects[2]);
        return newStudent;
    }
}
