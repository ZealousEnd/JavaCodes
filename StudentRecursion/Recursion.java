/**
 * @author Lorelei Alcazar
 * This class uses two recursive methods, one to multiply two single digit ints, and the other to find the "minimum" student.
 */
public class Recursion {

/**
 * @param i1 The first number to be multiplied.
 * @param i2 The second number to multiply by.
 * @return The product of the two multiplied numbers.
 * This method multiplies two single digit ints recursively and returns the result.
 */
	public static int singleDigitMultiply(final int i1, final int i2) {
	    if (i2 == 0) {
	        return 0;
	    } else {
	        return i1 + singleDigitMultiply(i1, i2 - 1);
	    }
	}

/**
 *@param students The array of students that will be compared.
 *@param numStudents The number of students in the array.
 *@return The "minimum" student
 *This method recursively compares students within an array to find the minimum students.
 */
    public static Student findMinimum(Student[] students, int numStudents) {
        if (numStudents == 1) {
            return students[0];
        } 
       	else {
            Student minimumStudent = findMinimum(students, numStudents - 1);
            if (students[numStudents - 1].compareTo(minimumStudent) < 0) {
                return students[numStudents - 1];
            } 
            else {
                return minimumStudent;
            }
        }
    }
}
