public class s32593 {
    public static void main(String[] args) throws Exception {
        int i = 10;
        i=i++; //wartośc 10 bo post inkrementacja. przypisuje i=i, a następnie robi inkrementacje która "wisi w powietrzu"
        System.out.println(i);
        i=++i; // najpierw inkrementuje, potem przypisuje, czyli i=11;
        System.out.println(i);  
        i=i++ + ++i; //podchwytliwe bo kolejność wykonywania działań. i=11 z "oczekującą post inkrementacją", następnie robi preinkrementacje i=12, teraz robimy tą oczekującą post inkrementacje i=13 wychodzi i = 11 + 13, i = 24
        System.out.println(i);

    }
}
