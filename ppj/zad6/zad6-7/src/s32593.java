import java.util.Objects;

public class s32593 {
    public static void main(String[] args) throws Exception {
       String[] slowa = {"Ala", "kota", "ma", "ma", "a", "kot", "Ale"};
        String wynik = "";

        System.out.println("sotrowanie w toku..");
        long start = System.currentTimeMillis();
        while(!Objects.equals(wynik,"Ala ma kota a kot ma Ale"))
        {
            wynik = "";
            for(int i =0; i<7; i++)
            {
                wynik=wynik+slowa[(int)(Math.random()*7)];
                if(Math.random()>0.5)wynik=wynik+" ";
                //if(i<6)wynik=wynik+" ";
            }
        }
        System.out.println("czas sortowania: " + (System.currentTimeMillis()-start) + "ms");
        System.out.println(wynik);
       }
    
}
