package pl.edu.pja.sladan.memento;

import java.util.LinkedList;
import java.util.List;

public class Caretaker {

    private List<Memento> mementoList = new LinkedList<>();

    public void addMemento(Memento memento){
        mementoList.add(memento);
    }

    public Memento getMemento(int index){
        return mementoList.get(index);
    }

}
