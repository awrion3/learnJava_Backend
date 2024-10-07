package week05;
import java.util.*;

public class Queue {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        java.util.Queue<String> fruitQueue =  new LinkedList<String>();
        // input elements in set
        fruitQueue.add("Apple");
        fruitQueue.add("Orange");
        fruitQueue.add("Grape");
        fruitQueue.add("Mango");
        fruitQueue.add("Banana");
        // print the queue
        System.out.println("Queue: " + fruitQueue);

        // remove the element at the front of the queue
        String front = fruitQueue.remove();
        System.out.println("Removed element: " + front);

        // print the updated queue
        System.out.println("Queue after removal: " + fruitQueue);

        // add another element to the queue
        fruitQueue.add("date");

        // peek at the element at the front of the queue
        String peeked = fruitQueue.peek();
        System.out.println("Peeked element: " + peeked);

        // print the updated queue
        System.out.println("Queue after peek: " + fruitQueue);
    }
}
