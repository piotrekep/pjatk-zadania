public class s32593 {
    public void method() throws Exception {
        Kwadrat kwadrat = new Kwadrat(666);
        kwadrat.show();
    }
}

class Kwadrat {
    private int bok;

    Kwadrat(int bok){
        this.bok=bok;
    }

    public void show(){
        System.out.println("Pole powieszchni kwadratu:" + bok*bok);
        System.out.println("Objętośc sześcianu: " + bok*bok*bok);
    }
}
