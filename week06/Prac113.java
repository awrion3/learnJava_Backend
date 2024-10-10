package week06;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Prac113 {
    public static void main(String[] args) {
        HashMap<Integer, String> myMap1 = new HashMap<>();
        myMap1.put(100, "Sun");
        myMap1.put(101, "Mercury");
        myMap1.put(102, "Venus");
        myMap1.put(103, "Earth");
        myMap1.put(104, "Mars");
        myMap1.put(105, "Jupiter");
        System.out.println("myMap1 = " + myMap1);

        LinkedHashMap<Integer, String> myMap2 = new LinkedHashMap<>();
        myMap2.put(103, "Earth");
        myMap2.put(100, "Sun");
        myMap2.put(101, "Mercury");
        myMap2.put(102, "Venus");
        myMap2.put(104, "Mars");
        myMap2.put(105, "Jupiter");
        System.out.println("myMap2 = " + myMap2);

        TreeMap<Integer, String> myMap3 = new TreeMap<>();
        myMap3.put(103, "Earth");
        myMap3.put(100, "Sun");
        myMap3.put(101, "Mercury");
        myMap3.put(102, "Venus");
        myMap3.put(104, "Mars");
        myMap3.put(105, "Jupiter");
        System.out.println("myMap3 = " + myMap3);

        TreeMap<Integer, String> myMap4 = new TreeMap<>();
        myMap4.putAll(myMap3);  //copy
        myMap4.put(106, "Saturn");
        System.out.println("myMap4 = " + myMap4);
    }
}
