package problem6;

public class Square extends Forme {
    private double side ;
    public Square(double side) {
        this.side =  side ;
    }

    public double getSide() {return this.side ; }

    public void setSide(double side) {this.side =  side ; }


    @Override
    public double getSurface() {
        return round2(this.side*this.side) ;
    }

    @Override
    public String toString() {
        return "Sqaure (side " + this.side + " cm)" ;
    }

}
