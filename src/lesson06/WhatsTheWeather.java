package lesson06;
import helpers.Keyboard;

public class WhatsTheWeather {
            // let us agree on a number chart
            final int SUNNY = 0;
            final int CLOUDY = 1;
            final int RAINY = 2;
            final int SNOWY = 3;
            final int  THUNDER = 4;
    
            // declare all the arrays we need
            static char[] weekDays = {'M','T','W','T','F','S','S'};
            static float[] temp = new float[7];
            static int[] humidity = new int[7];
            static int[] conditions = new int[7];

    public static void main(String[] args) {

        // record all temperature data for each day of the week
        for (int i = 0; i <= 6; i++) {
            System.out.println("Record data for " + weekDays[i]);

            // Ask user to input temperature of the day
            System.out.println("Enter temperature value: (C) ");
            temp[i] = Keyboard.readFloat();

            System.out.println(" ");

            // Ask user to input humidity of the day
            System.out.println("Enter humidity value: (%)");
            humidity[i] = Keyboard.readInt();

            System.out.println("-----------------------------------------");

            System.out.println(" ");

            // Ask user to input conditions of the day
            System.out.println("Enter condition value using the following code: ");
            System.out.println("Sunny [0], CLOUDY [1], RAINY [2], SNOWY [3], THUNDER [4],");
            humidity[i] = Keyboard.readInt();

            System.out.println("-----------------------------------------");
        }

        // data entry is complete
        System.out.println("Thank you for inputting the data for the next week!");

    }   
}
