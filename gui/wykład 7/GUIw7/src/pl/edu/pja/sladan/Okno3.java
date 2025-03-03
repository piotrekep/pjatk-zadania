package pl.edu.pja.sladan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Okno3 extends JFrame{

    public Okno3(){

        JPanel panel = new JPanel();


        JButton b1 = new JButton("PageStart");
        JButton b2 = new JButton("PageEnd");
        JButton b3 = new JButton("LineStart");
        JButton b4 = new JButton("LineEnd");
        JButton b5 = new JButton("Center");

        panel.setLayout(new BorderLayout());

        JPanel panelPageStart = new JPanel();
        panelPageStart.setLayout(new FlowLayout());

        panelPageStart.add(b1);
        panelPageStart.add(new JButton("aaa"));

        panel.add(panelPageStart, BorderLayout.PAGE_START);
        panel.add(b2, BorderLayout.PAGE_END);
        panel.add(b3, BorderLayout.LINE_START);
        panel.add(b4, BorderLayout.LINE_END);
        panel.add(b5, BorderLayout.CENTER);

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b5.setText("Clicked");
            }
        });

        add(panel);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
