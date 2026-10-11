package problem6;

public abstract class Forme {
    public abstract double getSurface() ;

    protected double round2(double value) {
        return Math.round(value*100.0)/100.0 ;
    }
}
