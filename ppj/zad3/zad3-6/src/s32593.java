public class s32593 {
    public static void main(String[] args) throws Exception {
        int a=10;
        double b=3.14;
        System.out.println(a=b); //kompilator odrzuci tą linijke, bo przypisanie bez konwersji typu jest w javie niedozwolone        System.out.println(b=a);
        System.out.println(b=a); //wykona się poprawnie, bo nie ma utraty danych "mniejszy" typ przypisujemy większemu
    }
}
