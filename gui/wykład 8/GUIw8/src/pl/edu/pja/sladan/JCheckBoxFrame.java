package pl.edu.pja.sladan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

public class JCheckBoxFrame extends JFrame {

    public JCheckBoxFrame(){

        JCheckBox jCheckBox1 = new JCheckBox("CheckBox1");
        JCheckBox jCheckBox2 = new JCheckBox("CheckBox2");
        JCheckBox jCheckBox3 = new JCheckBox("CheckBox3");

        jCheckBox2.setSelected(true);

        ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Object source = e.getItemSelectable();

                if(source == jCheckBox1){
                    jCheckBox1.setText(jCheckBox1.getText() + "+");
                }else if(source == jCheckBox2){
                    jCheckBox2.setText(jCheckBox2.getText() + "-");
                }else{
                    jCheckBox3.setText(jCheckBox3.getText() + "*");
                }

                if(e.getStateChange() == ItemEvent.SELECTED){
                    System.out.println("SELECTED");
                }else{
                    System.out.println("DESELECTED");
                }

            }
        };

        jCheckBox1.addItemListener(itemListener);
        jCheckBox2.addItemListener(itemListener);
        jCheckBox3.addItemListener(itemListener);

        jCheckBox1.setMnemonic(KeyEvent.VK_C);
        jCheckBox2.setMnemonic(KeyEvent.VK_D);
        jCheckBox3.setMnemonic(KeyEvent.VK_E);

        setLayout(new FlowLayout());

        add(jCheckBox1);
        add(jCheckBox2);
        add(jCheckBox3);

        setSize(200, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
