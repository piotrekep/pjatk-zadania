import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> numbers = new ArrayList<>();
        FileInputStream strumienPliku = null;

        try {
        strumienPliku = new FileInputStream("tab.txt");
        int znak;
       
        String buf = "";
        while((znak = strumienPliku.read()) != -1){
            
            if(znak=='-' || (znak>='0' && znak<='9') ){
                buf+=(char)znak;
            }
            else{
                if(!buf.isEmpty()){
                    numbers.add(Integer.valueOf(buf));
                    buf ="";
                }
            }
        }

        strumienPliku.close(); 
        } catch (IOException e) {
            
            e.printStackTrace();
        }
       
        System.out.println(numbers);
        Integer max = Collections.max(numbers);
        System.out.println(max);
        for(int i=0; i<numbers.size(); i++){
            if(numbers.get(i)==max)
             System.out.print(i+" ");
        }

    }
}
