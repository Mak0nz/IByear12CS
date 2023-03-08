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

        // confirm to user that pancake stack is ready
        System.out.println("Your order is ready, Yum!");
        
        // ask the user if they now want to eat the pancake
        System.out.println("Do you want to eat? (y/n)");
        char response = Keyboard.readChar();
        if (response == 'y') {
            System.out.print("How many pancakes do you want to eat?");
            Pancake eatMe = myBreakfast.pop();
            // todo: write code to eat pancake
        } else {
            System.out.println(":( The pancake will be gone to waste");
        }
    }
}
