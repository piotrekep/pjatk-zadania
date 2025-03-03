package pl.edu.pja.sladan;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Okno();
            }
        });

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Okno2();
            }
        });

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Okno3();
            }
        });
    }

}
