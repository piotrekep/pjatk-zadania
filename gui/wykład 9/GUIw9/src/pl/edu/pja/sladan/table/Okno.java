package pl.edu.pja.sladan.table;

import pl.edu.pja.sladan.list.MyListCellRenderer;
import pl.edu.pja.sladan.list.MyListModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.util.Vector;

public class Okno extends JFrame {

    public Okno(){
        generateFrame();
    }

    public void generateFrame(){

        Object[][] elementy = {
                {"Adam", "Kowalski", 30},
                {"Jan", "Nowak", 23},
                {"Michał", "Jabłoński", 22},
                {"Sławomir", "Oleksak", 18}
        };

        String[] kolumny = {"Imię", "Nazwisko", "Wiek"};

        JTable jTable = new JTable();

        jTable.setModel(new MyTableModel(elementy, kolumny));

        JScrollPane jScrollPane = new JScrollPane(jTable);

        add(jScrollPane);

        setSize(200, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
