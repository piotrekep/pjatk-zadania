public class s32593 {
    public static void main(String[] args) throws Exception {
        
        int[] tab1 = new int[(int)(Math.random()*10)];
        int[] tab2 = new int[(int)(Math.random()*10)];
        int[] tab3 = new int[(int)(Math.random()*10)];

        for(int j=0;j<tab1.length;j++)
            tab1[j]=(int)(Math.random()*10);

        for(int j=0;j<tab2.length;j++)
            tab2[j]=(int)(Math.random()*10);

        for(int j=0;j<tab2.length;j++)
             tab2[j]=(int)(Math.random()*10);

        int[][] tab2d = {tab1, tab2, tab3};

 
        for (int[] is : tab2d) {
            for (int is2 : is) {
                System.out.println(is2);
            }        
        }
    }
}
