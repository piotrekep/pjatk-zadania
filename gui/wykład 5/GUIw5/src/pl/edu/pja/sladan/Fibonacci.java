package pl.edu.pja.sladan;

public class Fibonacci {

    public static int rekurencyjnie(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return rekurencyjnie(n-1) + rekurencyjnie(n-2);
    }

    public static int iteracyjnie(int n){
        int f0 = 0;
        int f1 = 1;
        int tmp = 0;

        for(int i=2; i<=n; i++){
            tmp = f0+f1;
            f0 = f1;
            f1 = tmp;
        }

        return f1;
    }

}
