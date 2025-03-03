package pl.edu.pja.sladan;

import javax.swing.*;
import java.awt.*;

public class JSplitPaneFrame extends JFrame {

    public JSplitPaneFrame(){

        JPanel jPanel1 = new JPanel();
        jPanel1.setBackground(Color.BLUE);

        JPanel jPanel2 = new JPanel();
        jPanel2.setBackground(Color.GREEN);

        JSplitPane jSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jPanel1, jPanel2);
        jSplitPane.setDividerLocation(150);
        jSplitPane.setOneTouchExpandable(true);


        add(jSplitPane);

        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
