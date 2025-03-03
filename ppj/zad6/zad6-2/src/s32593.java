public class s32593 {
    public static void main(String[] args) throws Exception {
        int[] tab = new int[10];

        for(int i=0;i<10;i++){
              tab[i]=(int) Math.round(Math.random());
        }

        //można jeszcze tak
        for(int i=0;i<10;i++){
            tab[i]=(int) (Math.random()*2);
      }



    }
}
