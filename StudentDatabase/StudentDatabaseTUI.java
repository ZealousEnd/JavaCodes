/**
 *This class is a text-based interface allowing users to alter and view the Student Database!
 *
 * @author Lorelei Alcazar
 */
import java.util.Scanner;

public class StudentDatabaseTUI {
    private StudentDatabase database;
    private Scanner scanner;

    /**
    *The constructor.
    *@param database The database created in the main method, the database of Students.
    */

    public StudentDatabaseTUI(StudentDatabase database) {
        this.database = database;
        scanner = new Scanner(System.in);
    }

    /**
    *This is the main TUI loop, the actual lines ran during execution.
    */
    public void run() {
        while (true) {
            System.out.println("\nPlease enter a choice:");
            System.out.println("1. Add Student");
            System.out.println("2. Find Student via ID");
            System.out.println("3. Delete Student Record via Index");
            System.out.println("4. Print Student Database");
            System.out.println("5. Serilize Students to Disk");
            System.out.println("6. Deserialize Students");
            System.out.println("7. Write Database to Disk in CSV");
            System.out.println("8. Read Database from Disk in CSV");
            System.out.println("9. End the program");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    findStudent();
                    break;
                case 3:
                    removeStudent();
                    break;
                case 4:
                    printStudents();
                    break;
                case 5:
                    serializeStudents();
                    break;
                case 6:
                    deserializeStudents();
                    break;
                case 7:
                    studentsToCSV();
                    break;
                case 8:
                    studentsFromCSV();
                    break;
                case 9:
                    System.out.println("Ending program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid number, please enter a number from the list");
            }
        }
    }

    /**
     *This method is for adding a student to the database, including the collection of all relevant information.
     */
    private void addStudent() {
        System.out.println("Enter ID:");
        int enteredId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter sex:");
        String enteredSex = scanner.nextLine();

        System.out.println("Enter ethnicity:");
        String enteredEthnicity = scanner.nextLine();

        System.out.println("Enter name:");
        String enteredName = scanner.nextLine();

        System.out.println("Enter program:");
        String enteredProgram = scanner.nextLine();

        System.out.println("Enter academic plan:");
        String enteredAcademicPlan = scanner.nextLine();

        System.out.println("Enter subplan:");
        String enteredSubPlan = scanner.nextLine();

        System.out.println("Enter strt level:");
        int enteredLevel = scanner.nextInt();

        System.out.println("Enter total:");
        double enteredTotal = scanner.nextDouble();

        System.out.println("Enter GPA:");
        double enteredGPA = scanner.nextDouble();

        System.out.println("Does the student have fafsa? (Y or N)");
        String enteredFafsa = scanner.next();

        System.out.println("Enter taken programs:");
        double enteredTakenPrograms = scanner.nextDouble();

        System.out.println("Enter financial need:");
        double enteredFinancialNeed = scanner.nextDouble();

        Student enteredStudent = new Student();
        enteredStudent.setStudentID(enteredId);
        enteredStudent.setSex(enteredSex);
        enteredStudent.setEthnicGroup(enteredEthnicity);
        enteredStudent.setName(enteredName);
        enteredStudent.setProgram(enteredProgram);
        enteredStudent.setAcademicPlan(enteredAcademicPlan);
        enteredStudent.setSubPlan(enteredSubPlan);
        enteredStudent.setStrtLevel(enteredLevel);
        enteredStudent.setTotal(enteredTotal);
        enteredStudent.setGPA(enteredGPA);
        enteredStudent.setFAFSA(enteredFafsa);
        enteredStudent.setTakePrgrs(enteredTakenPrograms);
        enteredStudent.setFinancialNeed(enteredFinancialNeed);
        database.addStudents(enteredStudent);
        System.out.println("Student added!");
    }

    /**
     * The method to remove students from the database via index.
     */
    private void removeStudent() {
        System.out.println("Please type the index that you wish to delete:");
        int enteredIndex = scanner.nextInt();
        database.removeStudents(enteredIndex);
        System.out.println("Student removed!");
    }

    /**
     * The method used to find student indexes from ID numbers.
     */
    private void findStudent() {
        System.out.println("Enter student ID to find:");
        int studentID = scanner.nextInt();
        int index = database.indexOf(studentID);
        if (index != -1) {
            System.out.println("Student found at index: " + index);
        } else {
            System.out.println("Student not found.");
        }
    }

    /**
     *This method is used to print the database by.
     */
    private void printStudents() {
        database.printDatabase();
    }

    /**
     *This method serilizes the database to disk.
     */
    private void serializeStudents() {
        StudentDatabaseSerializer.serialize(database);
    }

    /**
     *This method is used deserialize the database.
     */
    private void deserializeStudents() {
        database = StudentDatabaseSerializer.deserialize();
    }

    /**
     * This method writes the database to disk in a list with commas.
     */
    private void studentsToCSV() {
        StudentDatabaseCSV.writingCSV(database);
    }

    /**
     * This method reads the database, in a list with commas, from the disk.
     */
    private void studentsFromCSV() {
        database = StudentDatabaseCSV.readingCSV();
    }

    /**
     * The main method of the program. It creates a new instance of TUI and runs another method Run.
     */
    public static void main(String[] args) {
        StudentDatabase model = new StudentDatabase();
        StudentDatabaseTUI userInterface = new StudentDatabaseTUI(model);
        userInterface.run();
    }
}
