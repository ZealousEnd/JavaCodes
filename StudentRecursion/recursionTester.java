/**
 * @author Lorelei Alcazar
 * This class tests the singledigitmultiply method and findminimum method written in recursion.java
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class recursionTester {

	/**
	 * This method tests the singledigitmultiply method by running two numbers and comparing the result to the desired result.
	 */
    @Test
    public void testSingleDigitMultiply() {
        assertEquals(0, Recursion.singleDigitMultiply(0, 0));
        assertEquals(2, Recursion.singleDigitMultiply(1, 2));
        assertEquals(9, Recursion.singleDigitMultiply(3, 3));
        assertEquals(25, Recursion.singleDigitMultiply(5, 5));
        assertEquals(10, Recursion.singleDigitMultiply(5, 2));
        assertEquals(12, Recursion.singleDigitMultiply(3, 4));
        assertEquals(81, Recursion.singleDigitMultiply(9, 9));
        assertEquals(64, Recursion.singleDigitMultiply(8, 8));
        assertEquals(32, Recursion.singleDigitMultiply(8, 4));
        assertEquals(21, Recursion.singleDigitMultiply(3, 7));
    }

    /**
     * This method tests the findminimum method by crerating an array of students, findidng the minimum via the method, and comparing
     * the result to the expected result.
     */
    @Test
    public void testFindMinimum() {
        Student[] arrayOfStudents = {
            new Student("Lizzie", "Shadow", 23, 4.0),
            new Student("Joel", "Beans", 20, 3.7),
            new Student("Scott", "Rain", 15, 4.2),
            new Student("Jimmy", "Lads", 3, 2.5)
        } ;

        assertEquals("Jimmy", Recursion.findMinimum(students, students.length).getFirstName());
    }
}
