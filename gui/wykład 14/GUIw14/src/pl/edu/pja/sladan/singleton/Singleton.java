package pl.edu.pja.sladan.singleton;

public class Singleton {

    private static Singleton singleton = null;

    private Singleton(){
        // ciało konstruktora
    }

    public static Singleton getInstance(){
        if(singleton == null)
            singleton = new Singleton();
        return singleton;
    }

}
