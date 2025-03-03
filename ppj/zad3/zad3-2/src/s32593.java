public class s32593 {
    public static void main(String[] args) throws Exception {
        boolean myBool=true;
        int myInt=122;
        char myChar='z';
        double myDobule=3.1416;
        //nie można porównywać typów innych niż boolean z booleanem
       //System.out.println((myBool==myInt)); 
       //System.out.println((myBool==myChar));
       //System.out.println((myBool==myDobule));

       System.out.println((myInt==myChar));
       System.out.println((myInt==myDobule));

       System.out.println((myChar==myDobule));
    }
}
