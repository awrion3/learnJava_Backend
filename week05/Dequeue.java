package week05;
import java.util.*;

public class Dequeue {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();

        // We can add elements to the queue
        // in various ways

        // Add at the last
        deque.add("Element 1 (Tail)");

        // Add at the first
        deque.addFirst("Element 2 (Head)");
        // Add at the last
        deque.addLast("Element 3 (Tail)");

        // Add at the first
        deque.push("Element 4 (Head)");
        // Add at the last
        deque.offer("Element 5 (Tail)");

        // Add at the first
        deque.offerFirst("Element 6 (Head)");

        System.out.println(deque + "\n");

        // We can remove the first element
        // or the last element.
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Deque after removing "
                + "first and last: "
                + deque);

        //second example
        System.out.println("Second Example");
        Deque<Integer> dq = new ArrayDeque<Integer>();
        // add elements
        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);
        dq.add(50);

        System.out.println(dq);

        dq.clear();
        System.out.println("After clear");
        System.out.println(dq);

        // elements at the head
        dq.addFirst(564);
        dq.addFirst(291);

        // addLast() method to insert the
        // elements at the tail
        dq.addLast(24);
        dq.addLast(14);

        System.out.println(dq);
    }
}