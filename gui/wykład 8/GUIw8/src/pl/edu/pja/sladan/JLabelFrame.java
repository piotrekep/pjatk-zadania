package pl.edu.pja.sladan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JLabelFrame extends JFrame {

    public JLabelFrame(){

        JLabel jLabel1 = new JLabel("Jakiś tekst");
        JLabel jLabel2 = new JLabel("tekst2");
        JLabel jLabel3 = new JLabel("tekst3");

        jLabel1.setFont(new Font("Courier", Font.BOLD, 12));

        jLabel2.setIcon(new ImageIcon("ok.png"));

        jLabel3.setText("<html><h1><i>Aaabbb  ccc</i></h1></html>");

        setLayout(new FlowLayout());

        add(jLabel1);
        add(jLabel2);
        add(jLabel3);

        setSize(200, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
