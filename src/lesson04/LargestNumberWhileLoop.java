package lesson04;
import helpers.Keyboard;

public class LargestNumberWhileLoop {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        int n1 = Keyboard.readInt();
        int counter = 0;

        while (counter < 2) {
            System.out.println("Please enter another number: ");
            int n2 = Keyboard.readInt();
            int result = compare(n1, n2);
            if (result == 1){
                n1 = n2;
            }
            
            counter = counter + 1;
        }

        System.out.println("Largest number is " + n1);
    }
    public static int compare(int n1, int n2) {
        if (n1 == n2){
            return 0;
        } if (n1 < n2){
            return 1;
        } else {
            return 2;
        }
    }
}