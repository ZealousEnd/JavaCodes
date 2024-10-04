import java.util.Scanner;

public class GetChange{

            public static void main(String[] args){

                                    Scanner input = new Scanner(System.in);

                                    System.out.print("Enter a dollar value with 2 decimal places: ");
// a double gots decimals
                                    double dollarValue = input.nextDouble();

                                    int numDimes = (int)dollarValue;
                                    numDimes /= .1;
                                    
                                
                                    // TODO: initialize numDimes based on the above specification.

 
                                    System.out.println(numDimes);
                                    //TODO: Print the value of numDimes to the screen.

 

            }

}

