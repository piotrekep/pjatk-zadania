package pl.edu.pja.sladan.list;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class Okno extends JFrame {

    public Okno(){
        generateFrame();
    }

    public void generateFrame(){

        Vector<String> imiona = new Vector<>();
        imiona.add("Adam");
        imiona.add("Jan");
        imiona.add("Michał");
        imiona.add("Sławomir");
        imiona.add("Zbigniew");

        MyListModel myListModel = new MyListModel(imiona);

        JList jList = new JList();
        jList.setModel(myListModel);

        jList.setCellRenderer(new MyListCellRenderer());

        JScrollPane jScrollPane = new JScrollPane(jList);

        JButton addButton = new JButton("Dodaj");
        JButton removeButton = new JButton("Usuń");

        JPanel jPanel = new JPanel(new GridLayout(1, 2));
        jPanel.add(addButton);
        jPanel.add(removeButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = jList.getSelectedIndex();
                if(i >= 0)
                    myListModel.add("Dodany element", i+1);
                else
                    myListModel.add("Dodany element na końcu");
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = jList.getSelectedIndex();
                if(i >= 0)
                    myListModel.remove(i);
            }
        });

        setLayout(new BorderLayout());
        add(jScrollPane, BorderLayout.CENTER);
        add(jPanel, BorderLayout.PAGE_END);

        setSize(200, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
