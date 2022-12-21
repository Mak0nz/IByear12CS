package lesson06;

import helpers.ArrayHelper;

public class DemoArrayHelper {
    public static void main(String[] args) {
        // declare one variable for integer for one number
        // assign my number to 5
        int myNumber = 5;

        // declare an array for 100 numbers
        // assign memory locations
        int[] myNumbers = new int[100];

        // putting myNumber in the first slot
        myNumbers[0] = myNumber;

        System.out.println(myNumbers[0]);

        // using array helpers
        ArrayHelper.fill(myNumbers, myNumber);

        boolean found = ArrayHelper.contains(myNumbers, myNumber);
        System.out.println(found);
        boolean notFound = ArrayHelper.contains(myNumbers, 6);
        System.out.println(notFound);

        
    }
}