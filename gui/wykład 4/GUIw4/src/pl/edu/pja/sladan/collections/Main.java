package pl.edu.pja.sladan.collections;

import com.sun.jdi.event.StepEvent;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        linkedList.add("ma");
        linkedList.add(0, "Ala");
        linkedList.add("3");
        linkedList.add("koty");
        linkedList.add("Ala");
//        System.out.println(linkedList.contains("kota"));
//        System.out.println(linkedList.contains("Ala"));
//        System.out.println(linkedList.isEmpty());
//        System.out.println(linkedList.size());
//        System.out.println(linkedList.indexOf("Ala"));
//        System.out.println(linkedList.lastIndexOf("Ala"));
//        System.out.println(linkedList);
//        linkedList.remove(2);
//        System.out.println(linkedList);
//        linkedList.remove("Ala");
//        System.out.println(linkedList);
//
//        arrayList.addAll(linkedList);
//        System.out.println(arrayList);

        Set<String> stringSet = new HashSet<>();

        stringSet.add("ala");
        stringSet.add("3");
        stringSet.add("ala");

//        System.out.println(stringSet);
//        stringSet.remove("ala");
//        System.out.println(stringSet);
//        System.out.println(stringSet.size());
//        System.out.println(stringSet.isEmpty());
////        stringSet.clear();
//        System.out.println(stringSet);
//        System.out.println(stringSet.contains("3"));

        Map<String, String> miastaPanstwa = new HashMap<>();
        miastaPanstwa.put("Warszawa", "Polska");
        miastaPanstwa.put("Ełk", "Polska");
        miastaPanstwa.put("Poznań", "Polska");
        miastaPanstwa.put("Berlin", "Niemcy");
        miastaPanstwa.put("Paryż", "Francja");

//        System.out.println(miastaPanstwa.get("Ełk"));
//        System.out.println(miastaPanstwa.isEmpty());
//        System.out.println(miastaPanstwa.size());
//        System.out.println(miastaPanstwa.containsKey("Poznań"));
//        System.out.println(miastaPanstwa.containsValue("Rosja"));
//        System.out.println(miastaPanstwa);
//        miastaPanstwa.remove("Poznań");
//        miastaPanstwa.remove("Warszawa", "Polska");
//        System.out.println(miastaPanstwa);

//        for(int i=0; i<linkedList.size(); i++){
//            System.out.println(linkedList.get(i));
//        }

        for(String s : linkedList)
            System.out.println(s);

        for(String s: stringSet)
            System.out.println(s);


        for(String key: miastaPanstwa.keySet())
            System.out.println(key);

        for(String value: miastaPanstwa.values())
            System.out.println(value);

        for(Map.Entry<String, String> entry : miastaPanstwa.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }



    }

}
