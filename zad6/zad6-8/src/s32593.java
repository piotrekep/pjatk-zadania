public class s32593 {
    public static void main(String[] args) throws Exception {
        char[] tab = new char[5];
        char[] mirror = new char[tab.length];

        for(int i=0; i<tab.length;i++)
        {
            tab[i]=(char)Math.round(Math.random()*26+65);
            mirror[(tab.length-1)-i]=tab[i];
            
        }
        for(int i=0; i<tab.length;i++)
            System.out.println(tab[i] + " " + mirror[i]);
        
    }
}
