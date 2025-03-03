public class s32593 {
    public void method() throws Exception {
        Walec walec = new Walec(66, 6);

        walec.show();
    }
}

class Walec {
    private int wysokosc;
    private int promien;

    Walec(int wysokosc, int promien){
        this.wysokosc=wysokosc;
        this.promien=promien;
    }

    public void show(){
        double pole=promien*promien*3.1416d;
        System.out.println("pole podstawy: " + pole);
        System.out.println("Objętość walca: " + pole*wysokosc);

    }
    
}
