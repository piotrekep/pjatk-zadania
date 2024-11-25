public class s32593 {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[10];
        int[] arr2 = new int[5];

        for(int i=0; i<arr.length; i++)arr[i]=(int)(Math.random()*10);
        for(int i=0; i<arr2.length; i++)arr2[i]=(int)(Math.random()*10);

        int[] output = method(arr,arr2,1);

        for(int i=0; i<output.length; i++)System.out.print(output[i] + " ");
        System.out.println();

    }

    static int[] method(int[] inArray1, int[] inArray2, int arg){

        if(arg<0){
            int[] output = new int[inArray1.length > inArray2.length ? inArray2.length : inArray1.length ];
            for(int i=0;i<output.length;i++){
              output[i]=inArray1[i]+inArray2[i];
            }
            return output;
        }
        
        else if(arg>0)
        {
            int[] output = new int[Math.abs(inArray1.length - inArray2.length)];
            int[] input = inArray1.length > inArray2.length ? inArray1 : inArray2;

            for(int i=0;i<output.length;i++){

                output[i]=input[i+output.length];

              }
            return output;
        }
        else return null;
    }
}
