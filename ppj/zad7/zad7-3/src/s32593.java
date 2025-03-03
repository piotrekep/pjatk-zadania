public class s32593 {
    public static void main(String[] args) throws Exception {
        char[][] tab ={
            {'S','a','m','s','u','n','g'},
            {'N','o','k','i','a'},
            {'A','p','p','l','e'},
            {'B','l','a','c','k','B','e','r','r','y'},
            {'A','l','c','a','t','e','l'},
            {'S','o','n','y'},
            {'J','o','l','l','a'}
        };

int sumaSlow, licznikLiter, licznikZnakow, kwalifikacja;
boolean maI;

        for(int i=0;i<tab.length;i++){
            kwalifikacja=0;
            sumaSlow=0;
            licznikLiter=0;
            maI=false;
            licznikZnakow=0;
            for(int j=0; j<tab[i].length;j++){

                sumaSlow=sumaSlow+tab[i][j];

                if(tab[i][j]=='i'){
                    maI=true;            
                }

                for(int k=j+1; k<tab[i].length;k++){
                    if(tab[i][j]==tab[i][k]){
                        licznikZnakow++;
                        licznikLiter++;
                    }
                    if(tab[i][j]==(tab[i][k]-0x20) || tab[i][j]==(tab[i][k]+0x20) )licznikLiter++;
                }

            }
            if(sumaSlow>255)kwalifikacja++;
            if(maI) kwalifikacja++;
            if(licznikLiter>0)kwalifikacja++;   
            if(licznikZnakow>0)kwalifikacja++;  

            System.out.println(kwalifikacja >=3 ? String.valueOf(tab[i]) : "");

        }
            
        
    }
}
