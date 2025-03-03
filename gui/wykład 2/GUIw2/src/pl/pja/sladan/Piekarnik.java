package pl.pja.sladan;

public class Piekarnik implements Urzadzenie {

    private boolean stan;

    public Piekarnik(){
        stan = false;
    }

    @Override
    public void wlacz(){
        if(stan)
            System.out.println("Piekarnik już włączony. Uważaj - gorące!");
        else
            System.out.println("Piekarnik włączony");
    }

    @Override
    public void wylacz(){
        if(stan)
            System.out.println("Piekarnik wyłączony");
        else
            System.out.println("Piekarnik już wyłączony");
    }


}
