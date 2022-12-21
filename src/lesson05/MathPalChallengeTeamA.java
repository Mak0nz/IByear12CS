package lesson05;
import helpers.Keyboard;

public class MathPalChallengeTeamA {
    public static void main(String[] args) {
        int result = 0;

        System.out.println("Are you ready to do some math?");        
        // Prompt the user to press Enter to continue...
        System.out.println("Press y to continue...");
        char isReady = 'y';
        isReady = Keyboard.readChar();

        while(isReady == 'y') {            
            System.out.println("1. Counting");
            System.out.println("2. Add");
            System.out.println("3. Subtract");
            System.out.println("4. Multiply");
            System.out.println("5. Divide");

            System.out.println("What to you want to try?");
            int function = Keyboard.readInt();
            System.out.println("--------------------------------");

            System.out.println("Enter two numbers");
            int n1 = Keyboard.readInt(); 
            int n2 = Keyboard.readInt();
            System.out.println("--------------------------------");

            int output = operationFunction(function, n1, n2, result);
            System.out.println(output); // Make the output more user friendly

            System.out.println("Do you want an explainer? (true/false)");
            boolean expl = Keyboard.readBoolean();

            // TODO: This requires a bit more planning
            // Why not have separate functions for explainers to keep it clean?
            // or perhaps make use of operationFunction to include the explainer.
            if (expl) {
                System.out.println("Output explanation");
            }

            System.out.println("Wanna have another go? (y/n)");
            isReady = Keyboard.readChar();
        }
        // Say "Bye bye then. See you next time!"
        System.out.println("Bye bye then. See you next time!");

    } 

    public static int operationFunction(int function, int n1, int n2, int result) {
        // use a switch case statement to switch between function
        // in each case, return the appropriate result e.g., n1 + n2
        // you should change the method signature to return a numeric type
        switch(function) {
            case 1:
                while (n1 <= n2) {
                    result = n1++;
                    if(result != n2){
                        System.out.println(result);
                    }
                }
                break;
            case 2:
                result = n1 + n2;
                break;
            case 3:
                result = n1 - n2;
                break;
            case 4:
                result = n1 * n2;
                break;
            case 5:
                result = n1 / n2;
                break;
            default :
                System.out.println("You did not input a available function.");
                break;
        }
        return result;
        }
}