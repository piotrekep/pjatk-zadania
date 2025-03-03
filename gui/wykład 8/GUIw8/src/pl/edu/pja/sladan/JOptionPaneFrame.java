package pl.edu.pja.sladan;

import javax.swing.*;

public class JOptionPaneFrame {

    public JOptionPaneFrame(){

        JOptionPane.showMessageDialog(null,
                "Message",
                "Title",
                JOptionPane.WARNING_MESSAGE);

        String a = JOptionPane.showInputDialog(null,
                "Message",
                "Title",
                JOptionPane.PLAIN_MESSAGE);

        System.out.println(a);

        String[] tab = {"First", "Second", "Third"};
        String s = (String) JOptionPane.showInputDialog(null,
                "Message",
                "Title",
                JOptionPane.PLAIN_MESSAGE,
                null,
                tab,
                tab[1]);

        System.out.println(s);

        String[] tab2 = {"Tak", "Nie"};
        JOptionPane.showOptionDialog(null,
                "Message",
                "Title",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                tab2,
                tab2[0]
                );


    }

}
