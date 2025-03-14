public abstract class Figura {
    
    public abstract double obliczPole();
    public abstract double obliczObwod();
    
    @Override
    public String toString(){
        return "jestem figurą";
    }
}