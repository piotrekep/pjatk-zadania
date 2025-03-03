package pl.edu.pja.sladan.generics;

public class Circle implements Figure{

    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle - radius = " + radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
