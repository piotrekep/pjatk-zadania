package pl.pja.sladan;

public class Komputer implements Urzadzenie{

    private boolean stan;

    public Komputer(){
        stan = false;
    }

    @Override
    public void wlacz(){
        if(stan)
            System.out.println("Komputer już włączony");
        else
            System.out.println("Komputer włączony");
    }

    @Override
    public void wylacz(){
        if(stan)
            System.out.println("Komputer wyłączony");
        else
            System.out.println("Komputer już wyłączony");
    }

    public void wymienCPU(){
        System.out.println("Wymienione");
    }


}
