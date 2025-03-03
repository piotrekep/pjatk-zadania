package pl.edu.pja.sladan;

import pl.edu.pja.sladan.factoryMethod.AbstractLocation;
import pl.edu.pja.sladan.factoryMethod.CracowLocation;
import pl.edu.pja.sladan.factoryMethod.WarsawLocation;
import pl.edu.pja.sladan.flyweight.SquareFactory;
import pl.edu.pja.sladan.memento.Caretaker;
import pl.edu.pja.sladan.memento.Originator;
import pl.edu.pja.sladan.singleton.Singleton;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        AbstractLocation a1 = new WarsawLocation();
//        AbstractLocation a2 = new CracowLocation();
//
//        //List<AbstractLocation> list = Arrays.asList(a1, a2);
//        List<AbstractLocation> list = List.of(a1, a2);
//
//        for(AbstractLocation al : list)
//            System.out.println(al.generateReport());

//        Singleton s1 = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
//
//        System.out.println(s1.equals(s2));

//        for(int i=0; i<1000; i++)
//            SquareFactory.getSquareDimension((int)(Math.random()*1000));
//
//        SquareFactory.count();

        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.addText("Ala ");
        caretaker.addMemento(originator.save());
        originator.addText("ma ");
        caretaker.addMemento(originator.save());
        originator.addText("kota.");
        caretaker.addMemento(originator.save());

        System.out.println(originator);

        originator.restore(caretaker.getMemento(2));
        System.out.println(originator);

        originator.restore(caretaker.getMemento(0));
        System.out.println(originator);

        originator.restore(caretaker.getMemento(1));
        System.out.println(originator);
    }

}
