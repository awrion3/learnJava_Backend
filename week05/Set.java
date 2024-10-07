package week05;
import java.util.*;

public class Set {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        java.util.Set<String> fruitSet =  new HashSet<String>();
        // input elements in set
        fruitSet.add("Apple");
        fruitSet.add("Orange");
        fruitSet.add("Grape");
        fruitSet.add("Mango");
        fruitSet.add("Banana");

        //print the Set object
        System.out.println(fruitSet);

        // check element is present in the set
        String searchKey = "Blackberry";
        System.out.println("Contains "+searchKey+" "+fruitSet.contains(searchKey));

        // Removing elements
        //hashSet.remove("Banana");
        fruitSet.remove(searchKey);

        //print the Set object
        System.out.println(fruitSet);

        // iterating through the Set
        for (String value: fruitSet)
            System.out.println(value +", ");

        // check the Set is empty or not
        System.out.println("The Set is Empty "+ fruitSet.isEmpty());

        // check the size of the Set
        System.out.println("The size of the Set is "+ fruitSet.size());

        java.util.Set<String> gameSet =  new HashSet<String>();
        gameSet.add("Baseball");
        gameSet.add("Badminton");
        gameSet.add("Football");
        gameSet.add("Cricket");

        java.util.Set<String> allSet = new HashSet<String>();
        //add all elements of another set
        allSet.addAll(gameSet); // After addition of Set
        System.out.println(allSet);

        allSet.removeAll(allSet); //After deletion of Set
        System.out.println(allSet);
    }
}
