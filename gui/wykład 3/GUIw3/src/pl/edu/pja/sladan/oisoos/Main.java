package pl.edu.pja.sladan.oisoos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws Exception {

//        String s = new String("Jakiś tekst");

        Osoba osoba = new Osoba("Jan", "Nowak", 25);

        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try{
            oos = new ObjectOutputStream(new FileOutputStream("oosFile.txt"));

//            oos.writeObject(s);
            oos.writeObject(osoba);

            ois = new ObjectInputStream(new FileInputStream("oosFile.txt"));
//            String text = (String)ois.readObject();
//            System.out.println(text);

            Osoba o = (Osoba)ois.readObject();
            System.out.println(o);

        }finally {
            if(oos != null)
                oos.close();
            if(ois != null)
                ois.close();
        }

    }

}
