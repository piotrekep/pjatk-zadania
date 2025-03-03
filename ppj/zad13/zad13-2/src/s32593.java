import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class s32593 {
    public void method(){
        FileInputStream strumienPliku = null;
        FileOutputStream strumienWyjsciowy = null;
        try {

        strumienPliku = new FileInputStream("plik tekstowy z liczba.txt");

        int znak;
        int liczba=0;
             

        while((znak = strumienPliku.read()) != -1){
            liczba=liczba<<1;
            liczba+=Character.getNumericValue(znak);  
           
            
        }
       System.out.println(liczba);

        strumienPliku.close(); 

        
        strumienWyjsciowy = new FileOutputStream("liczba.bin");

        strumienWyjsciowy.write((liczba >> 24) & 0xFF); 
        strumienWyjsciowy.write((liczba >> 16) & 0xFF);
        strumienWyjsciowy.write((liczba >> 8) & 0xFF);
        strumienWyjsciowy.write(liczba & 0xFF); 
        strumienWyjsciowy.getFD();
        strumienWyjsciowy.close();

        } catch (IOException e) {
            
            e.printStackTrace();
        }
          
        
    }
}
