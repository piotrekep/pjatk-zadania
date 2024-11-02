public class s32593 {
    public static void main(String[] args) throws Exception {
        int d=20,m=6;
 
 
        switch ((((d>=21 && m==3) || (m>=4 && m<=5) || (d<=20 && m==6)) ? 1 : 0) + 
                (((d>=21 && m==6) || (m>=7 && m<=8) || (d<=23 && m==9)) ? 2 : 0) +
                (((d>=21 && m==9) || (m>=10 && m<=11) || (d<=21 && m==12)) ? 3 : 0) + 
                (((d>=21 && m==12) || (m>=1 && m<=2) || (d<=21 && m==3)) ? 4 : 0) ) {
            
            case 1:
                System.out.println("Wiosna");
                break;
        
            case 2:
                 System.out.println("Lato");
                break;
        
            case 3:
                 System.out.println("Jesień");
                break;

            case 4:
                System.out.println("Zima");
               break;

            default:
                 System.out.println("błąd");
                break;
        }

        
    }
}
