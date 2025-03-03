package pl.edu.pja.sladan;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSliderFrame extends JFrame {

    public JSliderFrame(){

        JSlider jSlider1 = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);

        jSlider1.setMajorTickSpacing(50);
        jSlider1.setMinorTickSpacing(10);
        jSlider1.setPaintTicks(true);
        jSlider1.setPaintLabels(true);

        jSlider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider s = (JSlider) e.getSource();
                System.out.println(jSlider1.getValue());
            }
        });

        JSlider jSlider2 = new JSlider(JSlider.VERTICAL, 0, 100, 50);

        jSlider2.setMajorTickSpacing(20);
        jSlider2.setMinorTickSpacing(10);
        jSlider2.setPaintTicks(true);
        jSlider2.setPaintLabels(true);

        setLayout(new FlowLayout());

        add(jSlider1);
        add(jSlider2);

        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
