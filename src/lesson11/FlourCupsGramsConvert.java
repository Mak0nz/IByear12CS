package lesson11;

public class FlourCupsGramsConvert {
    
    // Source: www.examplelink.com/
    private final double GRAMS_PER_CUP = 120;

    private int numberOfCups;

    public FlourCupsGramsConvert(int numberOfCups) {
        this.numberOfCups = numberOfCups;
    }

    public double getNumberOfCups() {
        return this.numberOfCups;
    }

    public double getGrams() {
        return numberOfCups * GRAMS_PER_CUP;
    }
}