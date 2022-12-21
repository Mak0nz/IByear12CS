package lesson03;

import helpers.Keyboard;

public class Selection {
    public static void main(String[] args) {
        // Declare a variable to store the age
        int age;

        System.out.println("Please enter an age between 5 and 100 inclusive: ");
        age = Keyboard.readInt();

        // TODO: Milestone activities to show you reached a certain age
        if (age >= 90){
            System.out.println("Why are you still here?");
        } 
        else if (age >= 60){
            System.out.println("Enjoy your golden years!");
        }
        if (age < 60 && age > 21){
            System.out.println("Enjoy drink n drivin!");
        }    
        else if (age >= 35){
            System.out.println("Hows your midlife crisis?");
        }
        else {
            System.out.println("I know who you are...");
        }
    }
}