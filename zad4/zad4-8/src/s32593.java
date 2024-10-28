public class s32593 {
    public static void main(String[] args) throws Exception {
        
        int wrt = -3;
        boolean A, B, C;
        A=(wrt<=-10 && wrt>-15) || (wrt>-5 && wrt<0) || (wrt>5 && wrt<10) ;
        B=(wrt<-13) || (wrt>-8 && wrt<=-3);
        C=(wrt>=-4);
        System.out.println((A && B && C) ? "należy do części wspólnej" : "nie należy do częsci wspólnej" );
    }
}
