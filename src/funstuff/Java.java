package funstuff;
import java.lang.Math;

public class Java {
    public static void main(String[] args){
        int number = 2;
        while (true) {
            number = (int) Math.pow(number, number);
            System.out.println(number);
        }
    }
}
