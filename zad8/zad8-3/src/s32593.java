public class s32593 {
    public static void main(String[] args) throws Exception {
        char[] alaMaKota = {'A', 'l', 'a', ' ', 'm', 'a', ' ', 'k', 'o', 't', 'a'};
        char[] ciag = {'t','a','a','a'};

        method(alaMaKota,ciag);

    }


    static void method(char[] tablicaPrzeszukiwana, char[] ciag)
    {
       
        int licznik;

        for(int j=0; j<ciag.length;j++){
            boolean bylo=false;

            for(int i=0; i<j;i++)
            {
                if(ciag[j]==ciag[i]  ){
                    bylo=true;
                    break;
                }
            }

            if(!bylo){
            licznik=0;
            for(int k=0; k<tablicaPrzeszukiwana.length;k++){
                if(tablicaPrzeszukiwana[k]==ciag[j]) licznik++;
            }
            System.out.println("znak: " + ciag[j] + " wystąpił "+ licznik + " razy");
             }

        }
  
    }
    
}
