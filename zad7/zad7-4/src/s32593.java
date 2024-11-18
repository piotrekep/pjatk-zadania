public class s32593 {
    public static void main(String[] args) throws Exception {

        int[][] arr = new int[10][10];
        boolean sorted;
        int  buff;

        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)arr[i][j]=(int)(Math.random()*10);


        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++)System.out.print(arr[i][j]+ " ");
        System.out.println();
        }
        System.out.println();

        
      for(int i=0; i<arr.length; i++){
        sorted=false;
            while(!sorted)
            {
                sorted=true;
                for(int j=0;j<arr[i].length-1;j++)
                {
                    if(arr[i][j]>arr[i][j+1] ){
                        buff=arr[i][j];
                        arr[i][j]=arr[i][j+1];
                        arr[i][j+1]=buff;
                        sorted=false;
                    }
                }
            }

       }
 
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++)System.out.print(arr[i][j]+ " ");
        System.out.println();
        }
        System.out.println();
       
    }
}
