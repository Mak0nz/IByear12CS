package topic05learningaids.caitlin;

public class IdealGasEquation {
    
    /** 
    Data
    */
    public static final double R = 8.314; // the ideal gas constant

    public double v; // volume
    public double t; // temperature
    public double n; // number of moles
    public double p; // pressure

    public double result;


    /** 
    Constructors
    */
    public IdealGasEquation(double v, double t, double n, double p) {
        if (v >= 0) {
            this.v = v;
        }
        // TODO: update the rest of the properties

    }

    
    /** 
    Actions
    */
    public void calc(){
        // TODO: flowchart to determine how the formula will look
        // depending on the values given, the formula changes shape
    }
}
