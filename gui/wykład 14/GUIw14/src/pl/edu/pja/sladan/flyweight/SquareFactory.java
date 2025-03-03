package pl.edu.pja.sladan.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SquareFactory {

    private static Map<Integer, SquareDimension> map = new HashMap<>();

    public static SquareDimension getSquareDimension(int size){
        if(!map.containsKey(size))
            map.put(size, new SquareDimension(size));

        return map.get(size);
    }

    public static void count(){
        System.out.println(map.size());
    }

}
