 public class s32593 {
    public void method(){
        int rozmiarTablicy =3;
        int[][] tab = new int[rozmiarTablicy][rozmiarTablicy];

        for(int i=0;i<tab.length;i++)
            for(int j=0;j<tab[i].length;j++)
                tab[i][j]=(int)Math.round((Math.random()*5));


        try {
            test(tab);  
        } catch (Exception e) {
            System.out.println(e);
        }
                    
    }

    public static void test(int[][] tab)throws Exception{
        String error="";
        for(int i=0;i<tab.length;i++)
            for(int j=0;j<tab[i].length;j++){
                if(i!=j && tab[i][j]!=0){
                    if(error.length()>1)error+=", "; 
                    error+="["+String.valueOf(i)+","+String.valueOf(j)+"]";
                } 
            }
        if(error.length()>1)  throw new MojWyjatek("Błędy na pozycjach: "+error);
    }
}


class MojWyjatek extends Exception {
    public MojWyjatek(String message) {
        super(message);
    }
}