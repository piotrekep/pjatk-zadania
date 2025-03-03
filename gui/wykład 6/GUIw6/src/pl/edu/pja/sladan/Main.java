package pl.edu.pja.sladan;

import java.awt.event.MouseMotionAdapter;

public class Main {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);

        thread.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Trzeci wątek");
            }
        });

        t2.start();

        Thread t3 = new Thread(()-> System.out.println("Czwarty wątek"));

        t3.start();


        //brak synchronizacji
        System.out.println("Brak synchronizacji");

        Thread nonSyncThread1 = new NonSyncThread();
        Thread nonSyncThread2 = new NonSyncThread();
        Thread nonSyncThread3 = new NonSyncThread();

        nonSyncThread1.start();
        nonSyncThread2.start();
        nonSyncThread3.start();

        try {
            nonSyncThread1.join();
            nonSyncThread2.join();
            nonSyncThread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(NonSyncThread.value);

        //blok synchronizacyjny
        System.out.println("Blok synchronizacyjny");

        Thread syncThread4 = new SyncThread1();
        Thread syncThread5 = new SyncThread1();
        Thread syncThread6 = new SyncThread1();

        syncThread4.start();
        syncThread5.start();
        syncThread6.start();

        try {
            syncThread4.join();
            syncThread5.join();
            syncThread6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(SyncThread1.value);

        //metoda synchronizacyjna
        System.out.println("Metoda synchronizacyjna");

        Thread syncThread7 = new SyncThread2();
        Thread syncThread8 = new SyncThread2();
        Thread syncThread9 = new SyncThread2();

        syncThread7.start();
        syncThread8.start();
        syncThread9.start();

        try {
            syncThread7.join();
            syncThread8.join();
            syncThread9.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(SyncThread2.value);

    }

}
