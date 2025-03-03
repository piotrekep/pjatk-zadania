package pl.edu.pja.sladan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonFrame extends JFrame {

    public JButtonFrame(){

        JButton button = new JButton("Click me!");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText("Clicked");

                if(button.getBackground() == Color.GREEN)
                    button.setBackground(Color.ORANGE);
                else
                    button.setBackground(Color.GREEN);


            }
        });

//        button.setEnabled(false);
        button.setToolTipText("Przycisk");

        add(button);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}
