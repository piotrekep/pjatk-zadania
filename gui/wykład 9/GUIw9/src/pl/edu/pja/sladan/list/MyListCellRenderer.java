package pl.edu.pja.sladan.list;

import javax.swing.*;
import java.awt.*;

public class MyListCellRenderer extends JLabel implements ListCellRenderer {

    public MyListCellRenderer(){
        setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

        setText((String) value);

        if(index%2 == 0)
            setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 16));
        else
            setFont(new Font(Font.DIALOG, Font.PLAIN, 12));

        if(isSelected)
            setBackground(Color.YELLOW);
        else
            setBackground(Color.WHITE);


        return this;
    }
}
