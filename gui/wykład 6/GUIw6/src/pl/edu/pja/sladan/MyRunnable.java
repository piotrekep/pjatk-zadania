package pl.edu.pja.sladan;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Drugi wątek");
    }

}
