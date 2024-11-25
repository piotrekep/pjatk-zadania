public class s32593 {
    public static void main(String[] args) throws Exception {
        char[] alaMaKota = {'A', 'l', 'a', ' ', 'm', 'a', ' ', 'k', 'o', 't', 'a'};
        char[] ciag = {'t','a'};

        znajdzCiag(alaMaKota,ciag);

    }

    static void znajdzCiag(char[] tablicaPrzeszukiwana, char[] ciag)
    {

        boolean match=false;
        int i;

        if(ciag.length <= tablicaPrzeszukiwana.length){
            for(i=0; i<=(tablicaPrzeszukiwana.length-ciag.length); i++)
            {
                for(int j=0; j<ciag.length;j++)
                {
                    if(ciag[j] == tablicaPrzeszukiwana[i+j]) match=true;
                    else{
                        match=false;
                        break;
                    }
                }
                if(match){
                    System.out.println("jest w indeksie: "+ i);
                } 
            }
        }
        else System.out.println("błąd");
    }
    

}
