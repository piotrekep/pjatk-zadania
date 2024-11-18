public class s32593 {
    public static void main(String[] args) throws Exception {
        
        int[][] arr = new int[8][8];
        boolean przekatnaLP, przekatnaPL;
        int licznik=0;
        final int ILOSC_POWTORZEN=3;

do{
    przekatnaLP=false;
    przekatnaPL=false;

        for(int i=0; i<arr.length;i++)
            for(int j=0; j<arr[i].length;j++){
                arr[i][j]=(int)((Math.random())*11);

               if(i==j && i>=ILOSC_POWTORZEN && !przekatnaLP){
                    for(int k=i;k>=0;k--)
                        if(arr[i][j]==arr[k][k])
                        {
                            licznik++;
                            if(licznik>=ILOSC_POWTORZEN)przekatnaLP=true;
                        }
                    licznik=0;
                }
                
                else if(i==(arr[i].length-1-j) && i>=ILOSC_POWTORZEN && !przekatnaLP)
                {
                    for(int k=i;k>=0;k--)
                        if(arr[i][j]==arr[k][(arr[i].length-1-k)])
                        {
                            licznik++;
                            if(licznik>=ILOSC_POWTORZEN)przekatnaPL=true;

                        }
                    licznik=0;
                }
                 
            }
       
 }while(!(przekatnaLP & przekatnaPL));

        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.print(is2+ " ");
            }
            System.out.println();
        }
        System.out.println(przekatnaLP ? "są " + ILOSC_POWTORZEN +" w lewej" : "");
        System.out.println(przekatnaPL ? "są " + ILOSC_POWTORZEN +" w prawej" : "");
    }
}
