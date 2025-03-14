public class Prostokat extends Figura{
    private double bokA, bokB;

    public Prostokat(int a, int b){
        this.bokA=a;
        this.bokB=b;
    }

    public Prostokat(int a){
        this.bokA=a;
        this.bokB=a;
    }

    @Override
    public String toString(){
        if(bokA!=bokB)
          return "jestem prostokątekm o bokach: " + bokA + " i "+ bokB;
        else
          return "jestem kwadratem o boku: " + bokA;
    }

    @Override
    public double obliczPole() {
        return bokA*bokB;
    }
    @Override
    public double obliczObwod() {
        return (bokA+bokB)*2;
    }
    
}
