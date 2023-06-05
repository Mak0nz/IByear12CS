package lesson08;

public class Visits {
    
    private String hotelCode;
    private int days;

    public Visits(String h, int d) {
        hotelCode = h;
        days = d;
    }

    public int getDays() {
        return days;
    }
}
