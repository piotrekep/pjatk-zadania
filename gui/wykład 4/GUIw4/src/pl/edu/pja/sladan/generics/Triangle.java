package pl.edu.pja.sladan.generics;

public class Triangle implements Figure{

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "triangle - a = " + a + "; b = " + b + "; c = " + c;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}
