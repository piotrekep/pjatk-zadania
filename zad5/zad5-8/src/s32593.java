public class s32593 {
    public static void main(String[] args) throws Exception {

        java.util.Scanner in = new java.util.Scanner(System.in);
        char c=0;

        int azymut=0;

        while(c!='c')
        {
            c = in.next().charAt(0);
            if(c=='a'){
                if(azymut==0) azymut=360;
                azymut=azymut-90;
            } 
            if(c=='d'){
                azymut=azymut+90;
                if(azymut==360)azymut=0;
            } 
            
            switch(azymut){
                case 0:
                        System.out.println("North" + " "+ "⬆");
                        break;
                case 90:
                        System.out.println("East" + " "+ "➡");
                        break;
                case 180:
                        System.out.println("South" + " "+ "⬇");
                        break;
                case 270:
                        System.out.println("West" + " "+ "⬅");
                        break;
                default:
                        System.out.println(azymut);
            }
            
        }
        in.close();
    }
}
