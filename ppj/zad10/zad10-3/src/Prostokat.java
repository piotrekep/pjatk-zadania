public class Prostokat {
    private int bokA;
    private int bokB;

    Prostokat(int bokA, int bokB){
        this.bokB=bokB;
        this.bokA=bokA;
    }

    public void show(){
        System.out.println("pole powieszchni prostokąta: " +bokA*bokB);
    }

    public int bokA(){
        return bokA;
    }

    public int bokB(){
        return bokB;
    }

}
