package pl.edu.pja.sladan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JRadioButtonFrame extends JFrame {

    public JRadioButtonFrame(){

        JRadioButton jRadioButton1 = new JRadioButton("RadioButton1");
        JRadioButton jRadioButton2 = new JRadioButton("RadioButton2");
        JRadioButton jRadioButton3 = new JRadioButton("RadioButton3");

        jRadioButton1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println(e.getStateChange());
            }
        });

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Wybrano " + ((JRadioButton)e.getSource()).getText());
            }
        };

        jRadioButton1.addActionListener(actionListener);
        jRadioButton2.addActionListener(actionListener);
        jRadioButton3.addActionListener(actionListener);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        buttonGroup.add(jRadioButton3);

        setLayout(new FlowLayout());

        add(jRadioButton1);
        add(jRadioButton2);
        add(jRadioButton3);

        setSize(200, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
