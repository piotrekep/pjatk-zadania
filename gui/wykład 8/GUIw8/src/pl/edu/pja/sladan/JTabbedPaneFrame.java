package pl.edu.pja.sladan;

import javax.swing.*;
import java.awt.*;

public class JTabbedPaneFrame extends JFrame {

    public JTabbedPaneFrame(){

        JPanel jPanel1 = new JPanel();
        jPanel1.setBackground(Color.BLUE);
        JPanel jPanel2 = new JPanel();
        jPanel2.setBackground(Color.GREEN);
        JPanel jPanel3 = new JPanel();
        jPanel3.setBackground(Color.RED);

        JTabbedPane jTabbedPane = new JTabbedPane();

        jTabbedPane.add("Panel 1", jPanel1);
        jTabbedPane.add("Panel 2", jPanel2);
        jTabbedPane.add("Panel 3", jPanel3);

        add(jTabbedPane);

        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
