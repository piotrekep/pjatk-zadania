public class s32593 {
    public static void main(String[] args) throws Exception {

        byte myByte;
        short myShort;
        int myInt;
        long myLong;
        float myFloat;
        double myDouble;
        char myChar;
        boolean myBoolean;

        // najmniejsze wartości
        myByte=-127;    //byte jest bez znaku=najmniejsza wartość to -127
        myShort=-32768;
        myInt=0x80000000;
        myLong=0x8000000000000000L;
        myFloat=-3.4028235E38f; //chodzi o najmniejszą czyli najbardziej ujemną? czy najbliższą zeru?
        myDouble=-1.7976931348623157E308;
        myChar=0;
        myBoolean=false;

        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);

     // najmniejsze wartości
        myByte=127;    
        myShort=32767;
        myInt=0x7fffffff;
        myLong=0x7fffffffffffffffL;
        myFloat=3.4028235E38f; 
        myDouble=1.7976931348623157E308;
        myChar=0377;
        myBoolean=true;
        
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);

    }
}
