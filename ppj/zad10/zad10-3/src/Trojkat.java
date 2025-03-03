public class Trojkat {
    private int bok;

    Trojkat(int bok){
        this.bok=bok;
    }

    public void show(){
        System.out.println("pole powieszchni trojkata: " +bok*bok*1.732/4);
    }

    public int bok(){
        return bok;
    }



}
