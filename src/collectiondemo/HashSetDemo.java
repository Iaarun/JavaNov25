package collectiondemo;

import java.util.*;

/*
default size if 16 and loadfactor is 0.75
indexed based operation are not supported in hashset
use hashtable to store the tabs
 */
public class HashSetDemo {
    public static void main(String[] args) {
            HashSetDemo set = new HashSetDemo();
            set.allsets();
    }

    public void hashsetBasics(){
        HashSet<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("kiwi");
        fruits.add("kiwi");

        System.out.println(fruits);
        System.out.println("hash set size "+fruits.size());
        System.out.println( fruits.remove("kiwi"));
     //   fruits.clear();
        System.out.println(fruits.isEmpty());

        System.out.println(fruits.contains("apple1"));

        HashSet<String> vegies = new HashSet<>();
        vegies.add("potato");
        vegies.add("onion");
        vegies.add("spinach");

        fruits.addAll(vegies);
        System.out.println(fruits);
        fruits.removeAll(vegies);
        System.out.println(fruits);

        //convert set to list
        ArrayList <String> list = new ArrayList<>(fruits);


    }
    // why copilot stop suggestions

    public void iterateSet(){
        HashSet<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("kiwi");

        System.out.println("======== Using enhance for loop ======");
         for(String fruit: fruits){
             System.out.print(fruit+" ");
         }
        System.out.println();
        System.out.println("======== Using for each function ======");

        fruits.forEach(x->{
            System.out.print(x+" ");
        });

        System.out.println();
        System.out.println("======== Using for iterator ======");
        //List iterator cannot be used with the set

        Iterator<String> it = fruits.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }

        System.out.println();
        System.out.println("======== Using stream ======");
        fruits.stream().forEach(x->{
            System.out.print(x+" ");
        });
    }

    public void allsets(){
        HashSet <String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("kiwi");
        fruits.add("cherry");


        LinkedHashSet<String> fruits1 = new LinkedHashSet<>();
        fruits1.add("apple");
        fruits1.add("banana");
        fruits1.add("mango");
        fruits1.add("kiwi");
        fruits1.add("cherry");

        TreeSet<String> fruits2 = new TreeSet<>();
        fruits2.add("apple");
        fruits2.add("banana");
        fruits2.add("mango");
        fruits2.add("kiwi");
        fruits2.add("cherry");
        System.out.println("===Hashset====");
        System.out.println(fruits);
        System.out.println("===LinkedHashset====");
        System.out.println(fruits1);
        System.out.println("===TreeHashset====");
        System.out.println(fruits2);


    }

}
