package lesson03;
import helpers.Keyboard;
/** Write a program that accepts three numbers as input from the user
 * and outputs the largest one.
 */
public class LargestNumber {
    public static void main(String[] args) {
        /** Plan out the algorithm by writing steps in english...
         * Inputs 3 numbers into 3 variables
         * checks which number is the largest from first 2 and adds it to another variable
         * compares largest number with 3rd variable
         * outputs largest number variable in console
         */
        System.out.println("Please enter three number: ");
        int n1 = Keyboard.readInt();
        int n2 = Keyboard.readInt();
        int n3 = Keyboard.readInt();

        int bn = 0;
        if (n1 > n2){
            bn = n1;
        } else {
            bn = n2;
        }
        if (n3 > bn){
            bn = n3;
        }

        System.out.println("Largest number is " + bn);
    }
}