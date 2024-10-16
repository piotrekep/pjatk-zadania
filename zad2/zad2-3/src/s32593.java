public class s32593 {
    public static void main(String[] args) throws Exception {
        int input=435642234;

        System.out.printf("wartość reprezentowaną przez ostatnie 5 bitów tego literału: ");
        System.out.printf("%d\n",(input>>(32-5)) );
        
        System.out.printf("1 lub 0 zależnie od wartości siódmego bitu tego literału: ");
        System.out.printf("%d\n",(input & (1<<7))>>7 );
        
        System.out.printf("wartość poszczególnych bajtów (począwszy od najbardziej znaczącego) z których składa się ta liczba: ");
        System.out.printf("%d %d %d %d\n",(input>>24 & (0xff)),(input>>16 & (0xff)),(input>>8 & (0xff)),(input & (0xff)) );
        
        System.out.printf("wartość reprezentowaną przez dwa środkowe bajty literału reprezentowane jako liczba z przedziału 0-65535: ");
        System.out.printf("%d \n",(input & (0x00ffff00)) >>8);      
    }
}
