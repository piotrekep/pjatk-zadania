package pl.edu.pja.sladan;

public class SyncThread1 extends Thread {

    public static int value = 4000000;
    private static String monitor = new String();

    @Override
    public void run() {
        for(int i=0; i<1000000; i++){
            synchronized (monitor){
                value--;
            }
        }
    }
}
