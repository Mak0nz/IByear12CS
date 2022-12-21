package topic05learningaids;
import helpers.Keyboard;
/**
 * Thinking Recursively
 * P - Predict. Write or draw what you think the program will output. | Calculates a fibonacci sequence until the term you input from 0-6.
 * R - Run. Run the code and compare the actual result with your prediction. | correctos
 * I - Investigate. Work with someone to fill in the // with explainers of what the code is doing.
 * M - Modify. Make one small change, does not have to be spectacular.
 * M - Make. Create a new class to print out the Perfect Square Series from first principles. ==> (https://brilliant.org/courses/math-fundamentals/intro-to-math-fundamentals/)
 */
public class FibonacciSequence {
    public static void main(String[] args) {
       System.out.println("*** Fibonacci Sequence ***");
       System.out.println("**************************");

       // Prints the question and asks the user for a input 
       System.out.println("Please enter a number between 0 and 6:");
       int fiboN = Keyboard.readInt();
       System.out.println("--------------------------------------");
    
       // Starts a fibonacci sequence and calculates it until the user input
       for (int i = 1; i <= fiboN; i++) {
            System.out.print(fibonacci(i) + ", ");
       }
       System.out.println("");
    }

    public static int fibonacci(int n) {
        if (n > 1) {
            return fibonacci(n-1) + fibonacci(n-2);
        } else {
            return n;
        }
    }
}