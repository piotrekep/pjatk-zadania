public class s32593 {
    public static void main(String[] args) throws Exception {
        
        method(10, 'x');
       
    }

    static void method(int dlugoscBoku, char znak)
    {
        
        for(int kwadrat=dlugoscBoku*dlugoscBoku-1; kwadrat>=0; kwadrat--)
        {
           if(znak=='x') System.out.print((kwadrat % 2)==0 ? 'x' :'o');
           else if(znak=='o') System.out.print((kwadrat % 2)==0 ? 'o' :'x');
           else break;

           if((kwadrat % dlugoscBoku == 0)  ) System.out.print('\n');
        }
        
    }
}
