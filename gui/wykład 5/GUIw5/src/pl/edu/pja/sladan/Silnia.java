package pl.edu.pja.sladan;

public class Silnia {

    public static int rekurencyjnie(int n){
        if(n == 0)
            return 1;
        else
            return n * rekurencyjnie(n - 1);
    }

    public static int iteracyjnie(int n){
        int wynik = 1;

        for(int j=1; j<=n; j++)
            wynik *= j;

        return wynik;
    }

}
