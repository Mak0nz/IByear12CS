package yr12assignment;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.concurrent.TimeUnit;

import helpers.ArrayHelper;
import helpers.Keyboard;
/**
 * This is a simple menu-driven program for simple banking.
 * Transactions are read from a file and loaded into an array.
 * This application allows the user to display information,
 * send money, add money and exit the program.
 */
public class MySimpleBankingApp {
    /**
     * Declare variables that can be used by every method here! 
     */
    public static double balance = 250.00;
    public static String currency = "EUROs";
    public static String[] transactions = new String[5];
    public static String[] contacts = {"melb1234", "wchurchill456"};
    public static String transferAddress = "";

    public static void main(String[] args) {
        // we are calling this method first to load data
        // do not remove this
          init();

        boolean repeat = true;

        System.out.println("Welcome to Revolt!");
        // provide a menu of options:
        while(repeat) {            
            System.out.println("--------------------------------");
            System.out.println("A. Display Account Information");
            System.out.println("B. Add Money");
            System.out.println("C. Withdraw Money");
            System.out.println("D. Transfer Money");
            System.out.println("E. Quit");
            System.out.println("--------------------------------");
            System.out.println("What do you want to do?");
            char userChoice = Character.toLowerCase(Keyboard.readChar());
            systemThinking();

            // while userChoice != 'd'
            //          trigger appropriate action based on user choice (use switch case statement)
            //          ask for user choice again
            switch(userChoice){
                case 'a':
                    displayInfo();
                    systemThinking();
                    System.out.println("What do you want to do next?");
                    break;
                case 'b':
                    addMoney();
                    systemThinking();
                    System.out.println("What do you want to do next?");
                    break;
                case 'c':
                    withdrawMoney();
                    systemThinking();
                    System.out.println("What do you want to do next?");
                    break;
                case 'd':
                    transferMoney();
                    systemThinking();
                    System.out.println("What do you want to do next?");
                    break;
                case 'e':
                    repeat = false;
                    pause(1);
                    break;
            }
        }
        // if not repeated
        System.out.println("Thanks for choosing Revolt, see you next time!");
    }

    // adds system thinking effect
    public static void systemThinking() {
        System.out.print(".");
        pause(1);
        System.out.print(".");
        pause(1);
        System.out.print(".");
        pause(1);
        System.out.println("");
    }

    // create custom methods here for the functions
    public static void displayInfo() {
        System.out.println("Your balance is " + balance + " " + currency);
        System.out.println("Your recent transactions:");
        ArrayHelper.printElements(transactions);
    }

    public static void addMoney() {        
        boolean addMoneyRepeat = true;
        while (addMoneyRepeat) {
            System.out.println("Enter the amount you want to add to your balance: (" + currency +")");
            double addMoney = Keyboard.readDouble();
            systemThinking();
            if (addMoney <= 0) {
                System.out.println("Transaction failed. insufficient funds");
                System.out.println("Have another go...");
                pause(1);
            } else {
                balance = balance + addMoney;
                System.out.println(addMoney + " " + currency +" have been successfully withdrawn from your balance.");
                addMoneyRepeat = false;
            }
        } 
    }
    
    public static void withdrawMoney() {
        boolean withdrawRepeat = true;
        while (withdrawRepeat) {
            System.out.println("Enter the amount you want to withdraw from your balance: (" + currency +")");
            double withdraw = Keyboard.readDouble();
            systemThinking();
            if (withdraw <= 0) {
                System.out.println("Transaction failed. insufficient funds");
                System.out.println("Have another go...");
                pause(1);
            } else if (withdraw > balance) {
                System.out.println("transaction failed. insufficient funds");
                System.out.println("Have another go...");
                pause(1);
            } else {
                balance = balance - withdraw;
                System.out.println(withdraw + " " + currency +" have been successfully withdrawn from your balance.");
                withdrawRepeat = false;
            }
        } 
    }

    public static void transferMoney() {
        boolean transferContactConfirm = true;
        boolean transferBalanceConfirm = true;
        while (transferContactConfirm) {
            System.out.println("Input ID of transfer address:");
            transferAddress = Keyboard.readString();
            if (transferAddress.equals(contacts[0])  || transferAddress.equals(contacts[1])) {
                System.out.println("Searching for transfer address");
                systemThinking();
                System.out.println("Contact confirmed.");
                transferContactConfirm = false;
            } else {
                System.out.println("Searching for transfer address");
                systemThinking();
                System.out.println("Contact does not exist, please try again.");
            }
        }
        while (transferBalanceConfirm) {     
            System.out.println("Input transfer amount: (" + currency +")");
            double transferBalance = Keyboard.readDouble();
            systemThinking();
            if (transferBalance <= 0) {
                System.out.println("Transfer failed. insufficient funds");
                System.out.println("Have another go...");
                pause(1);
            } else if (balance < transferBalance) {
                System.out.println("Transfer failed. insufficient funds");
                System.out.println("Have another go...");
                pause(1);
            } else {
                balance = balance - transferBalance;
                System.out.println("Transfer successful.");
                System.out.println("Sent " + transferBalance + " " + currency + " to " + transferAddress);
                transferBalanceConfirm = false;
            }
        }
    }

    /**
     * an advanced function written by Ms C to read data from a file and store it into transactions
     */
    public static void init() {
        // make sure you have a text file
        File file = new File("yr12assignment", "MySimpleTransactions.txt");
        if (file.exists()) {
            int lines;
            try (Stream<String> stream = Files.lines(file.toPath(), StandardCharsets.UTF_8)) {
                lines = (int) stream.count();
                stream.close();
                if (lines > 0) {
                    Scanner fileScan = new Scanner(file);
                    for (int i = 0; i < lines; i++) {
                        transactions[i] = fileScan.nextLine();
                    }
                    fileScan.close();
                }
            } catch (IOException e) {
                System.out.println("Error: Did not manage to load data.");
            }
        }
    }

    private static void pause(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
        }
    }
}