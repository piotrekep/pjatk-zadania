public class s32593 {
    public static void main(String[] args) throws Exception {
        int a=10,b=11;
        boolean wynik;
       
        wynik = (!(a<b) && !(a>b));
        System.err.println(wynik);
        
        wynik = ((a>=b) && (a<=b)); //odwracamy porównania, żeby usunąć negacje
        wynik = ((a==b) && (a==b)); //dwa przeciwne porównania po obu stronah AND wykluczają sie
        wynik = a==b; //obiw strony AND są równe, redundantny kod
        System.err.println(wynik);
    }
}
