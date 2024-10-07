package week05;
import java.util.*;

public class List {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        java.util.List<Integer> list1 = new ArrayList<Integer>();

        list1.add(0,2);
        list1.add(1,5);
        list1.add(2,10);
        list1.add(3,15);
        list1.add(4,19);
        list1.add(5,19);
        System.out.println(list1);

        // update elements
        list1.set(3, 16);
        System.out.println(list1);

        // searching elements
        int index = list1.indexOf(19);
        System.out.println("The index of 19 is "+index);

        int lastIndex = list1.lastIndexOf(19);
        System.out.println("The index of 19 is "+lastIndex);

        // removing elements
        list1.remove(0); // element index
        System.out.println(list1);

        list1.remove(Integer.valueOf(10)); // element itself
        System.out.println(list1);

        // size of list
        System.out.println(list1.size());

        // get a single item
        int x = list1.get(2);
        System.out.println(x);

        // set a single item
        list1.set(3, 25);
        System.out.println(list1);

        //Check the list empty or not
        System.out.println(list1.isEmpty());
    }
}
