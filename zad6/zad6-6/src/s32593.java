public class s32593 {
    public static void main(String[] args) throws Exception {
        int tab[] = {789, 678, 567};

        for(int i=0; i<tab.length; i++)
            for(int j=i; j<tab.length; j++)
                System.out.println(i+ " "+ j);
    }
}
