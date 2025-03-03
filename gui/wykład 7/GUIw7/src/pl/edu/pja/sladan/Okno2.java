package pl.edu.pja.sladan;

import javax.swing.*;
import java.awt.*;

public class Okno2 extends JFrame{

    public Okno2(){

        Color kolorTla = Color.YELLOW;
        Color kolorPisma = Color.RED;
        String rodzajPisma = Font.SERIF;
        int rozmiarPisma = 24;
        int typPisma = Font.BOLD | Font.ITALIC;


        JTextArea poleTekstowe = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(poleTekstowe);

        poleTekstowe.setBackground(kolorTla);
        poleTekstowe.setForeground(kolorPisma);

        Font f = new Font(rodzajPisma, typPisma, rozmiarPisma);
        poleTekstowe.setFont(f);

        add(scrollPane);

        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
