public class Kwadrat {
    private int bok;

    Kwadrat(int bok){
        this.bok=bok;
    }

    public void show(){
        System.out.println("Pole powieszchni kwadratu:" + bok*bok);
        System.out.println("Objętośc sześcianu: " + bok*bok*bok);
    }
}
