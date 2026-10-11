package problem6;

public class Circle extends Forme {
    private static final double PI = 3.14 ;

    private double radius  ;

    public Circle(double radius ) {
        this.radius =  radius ;
    }

    public double getRadius() {return this.radius ; }

    public void setRadius(double radius) {this.radius  = radius ;}

    @Override
    public double getSurface() {
        return round2(PI*this.radius*this.radius) ;



    }

    @Override
    public String toString() {
        return "Circle (radius "+ this.radius + " cm)" ;

    }
}
