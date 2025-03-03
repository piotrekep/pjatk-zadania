import java.io.FileInputStream;
import java.io.IOException;

public class s32593 {
    public void method(){
        FileInputStream strumienPliku = null;
        try {

        strumienPliku = new FileInputStream("dowolny plik tekstowy.txt");

        int znak;
        wystapieniaZnaku[] wystapienia = new wystapieniaZnaku[1];       

        while((znak = strumienPliku.read()) != -1){

            int indeks = sprawdzCzyJestZnak((char)znak, wystapienia);
            if(indeks>-1){
                inkrementujZnak(indeks,  wystapienia);
            }
            else{
                wystapienia = dopiszZnak((char)znak, wystapienia);
            }
        }
        listujZnaki(wystapienia);

        strumienPliku.close(); 
        } catch (IOException e) {
            
            e.printStackTrace();
        }
          

    }

    int sprawdzCzyJestZnak(char znak, wystapieniaZnaku[] tab ){
        
             for(int i=0;i<tab.length;i++)
            {
                if(tab[i]!=null)
                if(tab[i].znak==znak) return i;
            }
        
        return -1;
    }
    
    void inkrementujZnak(int index,  wystapieniaZnaku[] tab ){
        tab[index].liczbaWystapien++;
    }

    wystapieniaZnaku[] dopiszZnak(char znak, wystapieniaZnaku[] tab){

        tab[tab.length-1]= new wystapieniaZnaku();
        tab[tab.length-1].znak=znak;
        tab[tab.length-1].liczbaWystapien=1;

        wystapieniaZnaku[] newTab = new wystapieniaZnaku[tab.length+1];
        for(int i=0;i<tab.length;i++)
        {
            newTab[i]=tab[i];
        }

        return newTab;

    }

    void listujZnaki( wystapieniaZnaku[] tab ){
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]!=null){
               if(tab[i].znak!='\n' && tab[i].znak!='\r') 
                    System.out.println("Znak: " +tab[i].znak + " wystąpił " + tab[i].liczbaWystapien + " razy");
                else if(tab[i].znak =='\n')
                    System.out.println("Znak: " +"\\n "+ " wystąpił " + tab[i].liczbaWystapien + " razy");
                else
                    System.out.println("Znak: " +"\\r "+ " wystąpił " + tab[i].liczbaWystapien + " razy");
  
            }

        }
    }
  

}

class wystapieniaZnaku {
    char znak;
    int liczbaWystapien;

}