package week08;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;
import java.util.Set;
import java.util.ArrayList;
import java.util.ArrayDeque;

public class Prac02 {
    //class blueprint: objects are instances of class
    //variables & methods; access modifier:
    //method; parameter passing; type, order should match
    //constructor; creation method, default/parameterized

    //Datatype: Array
    int [] src = {1, 2, 3, 4, 5};
    int [] arr = new int[src.length];
    //passing array
    /* public void methodName(int[] arr){
         arr[0] = 10;
    }*/
    //String class; string conversion; .trim()

    //Relation between classes
    //-> association; call, has a
    //assoc+ownership; aggregation
    //assoc+dependant; composition (black UML)

    //interface = abstract class, to group related methods
    //multiple interfaces can be implemented by single class
    //same methods in single class; have to implement only one

    //java collection framework
    //set, list(ordered)
    Set<String> set = new HashSet<>();
    List<String> list =  new ArrayList<>();
    //fifo //double-ended
    Queue<Integer> queue = new LinkedList<>();
    Deque<Integer> deque = new ArrayDeque<>();
    //map; key-value .put method
    HashMap<String, Integer> map = new HashMap<>();
    LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
    TreeMap<String, Integer> treeMap = new TreeMap<>();

    //Inheritance; sub(specialized)-empty arrow>super(generalized)
    //super(parent)-subclass
    //subName extends superName
    //public, default, protected allows access to subclass

    //method already defined
    //super-sub; method overriding (different classes, same signature, access level not wider)
    //@Override annotation
    //polymorphism one obj declare = other obj;
    //super. immediate parent object
    //ParentClass() { super(); } //super.variable
    //sub will call super's constructor
    //method overloading, within same class, (parameter types differ)ㅈㅈㄴㄷ

    //polymorphism; different functionality = which new Object
    //inheritance base class ref = other derived class objects
}