public class s32593 {
    public static void main(String[] args) throws Exception {
        double x;
        
        for(int i=0;i<10;i++){
            System.out.println(1/potega(2,i));
        }
    }

    public static double potega(double x, int y)
    {
        switch(y){
            case 0: return 0d;
            case 1: return x;

            default:
                    while(y>1){
                     x=x*x;
                     y--;
                    }
                    return x;
        }

    }
}
