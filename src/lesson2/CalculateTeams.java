package lesson2;

import helpers.Keyboard;
/**
 * 
 * The Year 13 students have been told to get into teams of a specific size for the
 * Group 4 Project due next week. 
 * Write a program that: 
 *    - Prompts for the total number of students.
 *    - Prompts for size of the teams to be formed.
 *    - Displays how many teams can be formed.
 *    - Displays how many students are left without a team.
 * 
 * Use appropriate naming conventions and be sure to add comments.
 * Hint: Make use of the mod operator %
 */
public class CalculateTeams {
    public static void main(String[] args) {
        //Declares and Input data variable
        System.out.print("Enter the total number of students: ");
        int students = Keyboard.readInt();

        System.out.println("Enter the teams size: ");
        int TeamSize = Keyboard.readInt();

        // Outputs and calculates data in a readable format
        System.out.println("Number of teams: "+ students / TeamSize);
        System.out.println("Number of students remaining: "+ students % TeamSize);
    }
}