package pl.pja.sladan;

public class Main {

    public static void main(String[] args) {

        Pracownik p1 = new Pracownik("Jan", "Nowak");
        Pracownik p2 = new Pracownik("Kuba", "Janiak");
        Pracownik p3 = new Pracownik("Kuba", "Janiak");
        Osoba o1 = new Osoba("Adam", "Kowalski");

//        System.out.println(o1);
//        System.out.println(p1);
//
//        p1.przywitajSie();
//        p1.przywitajSie(1);
//        p1.przywitajSie("Sławek");

//        System.out.println(p1.hashCode());
//        System.out.println(p2.hashCode());
//        System.out.println(p1.equals(p2));
//        System.out.println(p2.equals(p3));


//        Show s = (str)-> System.out.println("Hello LW " + str);
//        s.showHelloWithText("Ala");
//
//        Samochod s1 = new Samochod();
//        s1.showTypPojazdu();
//
//        Pojazd pojazd1 = new Pojazd() {
//            @Override
//            public void showTypPojazdu() {
//                System.out.println("Typ: Motor");
//            }
//        };
//
//        pojazd1.showTypPojazdu();


        Komputer k1 = new Komputer();
        Piekarnik piek1 = new Piekarnik();
        k1.wlaczKomputer();
        piek1.wlaczPiekarnik();

        k1.wymienCPU();

        Urzadzenie u1 = (Urzadzenie)k1;
        ////u1.wymienCPU();


    }
}
