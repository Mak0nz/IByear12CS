package lesson03;
import helpers.Keyboard;

public class CurrencyConverter {
    public static void main(String[] args) {   
        int newamount;

        System.out.println("Choose which currency you want to convert (euro | dollar): ");
        String currency = Keyboard.readString();
        
        if (currency == "euro"){
            System.out.println("How much Euros do you want to convert? ");
            int amount = Keyboard.readInt();
        }
        if (currency == "dollar"){

        }
        else {
            System.out.println("You did not type in a valid response!");
            System.out.println("Choose which currency you want to convert (euro | dollar): ");
            currency = Keyboard.readString();
        }
    } 
}
