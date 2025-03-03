package pl.edu.pja.sladan;

public class Main {

    public static void main(String[] args) {

        System.out.println(Silnia.rekurencyjnie(5));
        System.out.println(Silnia.iteracyjnie(5));

        System.out.println(Fibonacci.rekurencyjnie(15));
        System.out.println(Fibonacci.iteracyjnie(15));

        long timeStart = 0;
        long timeEnd = 0;

        timeStart = System.currentTimeMillis();
        System.out.println(Fibonacci.rekurencyjnie(45));
        timeEnd = System.currentTimeMillis();

        System.out.println(timeEnd - timeStart + " ms");

        timeStart = System.currentTimeMillis();
        System.out.println(Fibonacci.iteracyjnie(45));
        timeEnd = System.currentTimeMillis();

        System.out.println(timeEnd - timeStart + " ms");
    }

}
