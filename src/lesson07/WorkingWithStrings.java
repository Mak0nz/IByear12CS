package lesson07;

import helpers.Keyboard;

public class WorkingWithStrings {
    public static void main(String[] args) {

        String myString = new String();
        boolean endWith = myString.endsWith("s");

        // declaration and assignment of strings
        String paymentTypeCard = new String("card");
        String paymentTypeCash = "cash"; // you will use this method most

        // ask for the payment type as input
        System.out.println("Enter your payment type (cash/Card)");
        String userPaymentType = Keyboard.readString();

        // Compare userPaymentType with existing paymentTypes
        if (userPaymentType.equals(paymentTypeCard)) {
            System.out.println("You are paying by card."); // we cnnot use == because java will check for the memory not input state.
        }
        if (userPaymentType.equals(paymentTypeCash)) {
            System.out.println("You are paying by cash.");
        }
        
    }
}
