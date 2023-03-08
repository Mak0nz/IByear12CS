package topic05learningaids.stacks;
import helpers.Keyboard;

public class PancakeMain {
    public static void main(String[] args) {
        // instansiate a PancakeStack
        PancakeStack myBreakfast = new PancakeStack("butter and Maple Syrup");

        // ask the user how many pancakes they want, must be between 2 and 5
        System.out.println("Please enter the number of pancakes you want (must be between 2 and 5)");
        int number = Keyboard.readInt();
        
        // loop between 0 up to not including number, and push
        for (int i = 0; i < number; i++) {
            myBreakfast.push();
        }
    }
}
