public class s32593 {
    public static void main(String[] args) throws Exception {
       String[] slowa = {"Ala", "ma", "kota", "a", "kot", "ma", "Ale"};

       for (String string : slowa) {
        System.out.print(string + " "); // w zadaniu jest nieczytelne czy tablica zaweira spacje po kazdym słowie
       }
       System.out.println();
       
       //ten nie wstawia spacji na końcu
       for(int i=0; i<slowa.length; i++)
       {
        System.out.print(slowa[i]);
        if(i<slowa.length) System.out.print(" ");
       }
    }
}
