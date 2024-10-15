public class s32593 {
    public static void main(String[] args) throws Exception {
        int a1=0x6d, a2=13, a=a1&a2,
            b1=0xA, b2=15 , b=b1 | b2,
            c1=11<<2, c2=c1^42, c=c1 ^ c2;
        System.out.println(a+" "+b+" "+c);
    }
}
