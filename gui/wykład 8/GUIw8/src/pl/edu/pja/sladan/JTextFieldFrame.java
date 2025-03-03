package pl.edu.pja.sladan;

import javax.swing.*;
import java.awt.*;

public class JTextFieldFrame extends JFrame {

    public JTextFieldFrame(){

        JTextField jTextField = new JTextField();

        jTextField.setBackground(Color.GREEN);
        jTextField.setForeground(Color.BLUE);
        jTextField.setFont(new Font("Times New Roman", Font.ITALIC, 24));

        add(jTextField);

        setSize(200, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
