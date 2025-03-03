package pl.edu.pja.sladan;

import javax.swing.*;
import java.awt.*;

public class Okno extends JFrame {

    public Okno(){

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                int width = getWidth()-1;
                int height = getHeight()-1;

                g.setColor(Color.BLUE);

                for(int i=10; i<width/2; i+=10)
                    g.drawRect(i, i, width-i*2, height-i*2);

            }
        };

        panel.setBackground(Color.YELLOW);

        add(panel);
        setSize(200, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
