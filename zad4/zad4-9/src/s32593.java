public class s32593 {
    public static void main(String[] args) throws Exception {
       int wrt=-14;
       boolean A,B;
       A=(wrt>-15 && wrt<-10);
       B=(wrt<-13);
       System.out.println((A ^ B ) ? "należy tylko do jednego zbioru" : "należy do obu, lub żadnego" );
    }
}
