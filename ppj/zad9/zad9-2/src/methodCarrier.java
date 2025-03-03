public class methodCarrier {
    
    public void setValue(int x)
    {
        System.out.println(x);
        x++;
        System.out.println(x);
    }

    public void setValue(float x)
    {
        System.out.println(x);
        x++;
        System.out.println(x);
    }    
    
    public void setValue(Number x)
    {
        System.out.println(x.showValue());
        x.setValue(x.showValue()+1);
        System.out.println(x.showValue());
    }
}
