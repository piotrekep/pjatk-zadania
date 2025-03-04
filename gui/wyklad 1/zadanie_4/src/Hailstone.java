import java.util.Iterator;


public class Hailstone implements Iterable<Integer>  {
    private int val;

    Hailstone(int init){
        this.val=init;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int current = val;

            @Override
            public boolean hasNext() {
                if(val!=1)
                     return true;
                else
                    return false;
            }

            @Override
            public Integer next() {
                if(val % 2 ==0){
                    current=current/2;
                }
                else{
                    current=3*current+1;
                }
                val=current;

                return val;
            }
        };



        
    }

    
    
}
