public class s32593 {
    public static void main(String[] args) throws Exception {
        Cplx a = new Cplx(3, 4);
        Cplx b = new Cplx(1, 2);
        Cplx c = new Cplx(2, 3);

        System.out.println("wartosci początkowe:");
        a.show();
        b.show();
        c.show();

        c.inc();
        System.out.println("wartosć po inkrementacji:");
        c.show();

        a.add(b);
        System.out.println("wartosć po dodaniu:");
        a.show();

        a.sub(b);
        System.out.println("wartosć po odejmowaniu:");
        a.show();

        a.mul(b);
        System.out.println("wartosć po mnożeniu:");
        a.show();

   

    }
}
