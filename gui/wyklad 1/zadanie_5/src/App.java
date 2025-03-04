public class App {
    public static void main(String[] args) throws Exception {
        int[] tab = new int[100];

        for(int i=0; i<tab.length; i++)
        {
            tab[i]= (int)Math.round(Math.random()*90+10);
            System.out.print(tab[i] + " ");
        }
        System.out.println();
        cocktail(tab);

        for (int j : tab) {
            System.out.print(j + " ");
        }
           
       

    }


    static void cocktail(int[] tab){
        int startIdx=0;
        int endIdx=tab.length-1;
        boolean forward = true;
        int i=startIdx;
        
        while(startIdx!=endIdx)
        {
            if(forward){
                if(tab[i]>tab[i+1])
                {
                    swap(tab,i,i+1);
                }
                i++;
                if(i==endIdx){
                    forward=false;
                    endIdx--;
                }
            }
            else{
                
                if(tab[i]<tab[i-1])
                {
                   swap(tab,i,i-1);
                }
                i--;
                if(i==startIdx){
                    forward=true;
                    startIdx++;
                }

            }
        }
    }

    static void swap(int[] tab, int idx1, int idx2){
        int temp;
        temp=tab[idx2];
        tab[idx2]=tab[idx1];
        tab[idx1]=temp;
    }
}
