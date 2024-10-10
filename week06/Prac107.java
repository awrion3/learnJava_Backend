package week06;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Prac107 {

    public static void main(String[] args) {
        HashMap <Integer, String> myMap = new HashMap <> ();

        myMap.put(1000, "Apple");
        myMap.put(2000, "Banana");
        myMap.put(3000, "Grape");
        myMap.put(4000, "Pineapple");

        System.out.println(myMap);
        System.out.println(myMap.get(1000));
        System.out.println(myMap.get(10000));

        myMap.replace(4000, "Kiwi");
        System.out.println(myMap);

        myMap.remove(2000);
        System.out.println(myMap);

        for(Integer key: myMap.keySet()) {
            String value = myMap.get(key);
            System.out.println("value = " + value);
        }

        System.out.println(myMap.size());
        System.out.println(myMap.isEmpty());

        //LinkedHashMap keeps insertion order
        LinkedHashMap <Integer, String> myLinkedMap = new LinkedHashMap <> ();

        myLinkedMap.put(1000, "Apple");
        myLinkedMap.put(2000, "Banana");
        myLinkedMap.put(3000, "Grape");
        myLinkedMap.put(4000, "Pineapple");

        System.out.println(myLinkedMap);

        //TreeMap: automatic sorting by keys regardless of input order
        TreeMap <Integer, String> myTreeMap = new TreeMap <> ();

        myTreeMap.put(3000, "Grape");
        myTreeMap.put(1000, "Apple");
        myTreeMap.put(2000, "Banana");
        myTreeMap.put(4000, "Orange");

        System.out.println(myTreeMap);

        System.out.println(myTreeMap.firstKey());
        System.out.println(myTreeMap.lastKey());

        System.out.println(myTreeMap.headMap(2000)); //not included
        System.out.println(myTreeMap.tailMap(2000)); //included
    }
}