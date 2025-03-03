package pl.edu.pja.sladan.list;

import javax.swing.*;
import java.util.Vector;

public class MyListModel extends AbstractListModel {

    public Vector<String> imiona;

    public MyListModel(Vector<String> imiona){
        this.imiona = imiona;
    }

    @Override
    public int getSize() {
        return imiona.size();
    }

    @Override
    public Object getElementAt(int index) {
        return imiona.get(index);
    }

    public void add(String text, int index){
        imiona.add(index, text);
        fireIntervalAdded(this, index, index);
    }

    public void add(String text){
        add(text, getSize());
    }

    public void remove(int index){
        imiona.remove(index);
        fireIntervalRemoved(this, index, index);
    }

}
