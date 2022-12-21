package lesson03;
// This is a program that gets the largest number from a data structure of numbers
public class LargestNumberList {
    public static void main(String[] args) {
        // data structure of numbers(int)
        int[] numbers = new int[5];   //array
        numbers[0] = 17;
        numbers[1] = 23;
        numbers[2] = 64;
        numbers[3] = 69;
        numbers[4] = 420;

        //declare a variable to store the largest number
        int largest = numbers[0];

        // loop while i still have numbers to go through the data structure
        int myMemoryPointer = 0;
        while(myMemoryPointer < 4) {
            int compare = numbers[(myMemoryPointer+1)];
            largest = larger(largest, compare);
            myMemoryPointer = myMemoryPointer+1; // make pointer move one place in my data structure
        }

        System.out.println("The largest number is " + largest);

    }
    // public static output_type naomeOfPrefefinedProcess (input variables)
    public static int larger(int n1, int n2){
        if (n1 > n2) {
            return n1; //return is the output
        } else {
            return n2;
        }
    }
}
