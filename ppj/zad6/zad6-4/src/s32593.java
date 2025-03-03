public class s32593 {
    public static void main(String[] args) throws Exception {
        double[] tab = new double[10];
        
        System.out.println("tablica:");
        for(int i=0; i<10; i++) {
            tab[i]=Math.random(); // nie podano zakresu liczb losowych. przyjmuje domyślny
            System.out.println(tab[i]);   
        }
        
        System.out.println("parzyste indeksy:");
        for(int i=0; i<10; i++){
            if(i%2==0)System.out.println(tab[i]); 
        }

        System.out.println("wartości nieparzyste:");
        for(int i=0; i<10; i++){
            if((int)tab[i]%2!=0)System.out.println(tab[i]); 
        }

    }
}
