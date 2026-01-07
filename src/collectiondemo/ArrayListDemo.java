package collectiondemo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayListDemo demo = new ArrayListDemo();
      //  demo.arrayListExample();
        demo.iterateOverList();
    }

    public void arrayListExample() {
        //declare an ArrayList of default size 16
        // typesafe ArrayList<String> list = new ArrayList<String>();
        //<> is known as diamond operator or java generics
        //Arraylist can grow dynamically and are indexed collection of objects
        ArrayList<String>  list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");

        System.out.println(list);

        // collection support only object types
        //Wrapper class for primitive data types
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        System.out.println(intList);

        ArrayList<Boolean> boolList = new ArrayList<>();
        boolList.add(true);
        boolList.add(false);



    }

    public void arrayListOperations() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Cherry");
        list.add("Orange");


        // Accessing elements using get()
        String firstItem = list.get(2);
        System.out.println("First item: " + firstItem);
        //to find the size of an arraylist
        int size = list.size();
        System.out.println("Size of the list: " + size);
        //add
        list.add("Pineapple");
        System.out.println(list);
        list.add(0,"Grapes");
        System.out.println(list);

        //remove
        System.out.println( list.remove("Orange1"));
        System.out.println(list);
      // list.clear();
       // System.out.println(list);
        System.out.println(list.indexOf("Orange"));
        System.out.println(list.lastIndexOf("Orange1"));

        // isEmpty
        System.out.println(list.isEmpty());

        //sublist
        System.out.println(list.subList(1,4));
       //trimtoSize  free the unused memory
        list.trimToSize();

    }

    public void listtoArray(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Cherry");
        list.add("Orange");
        System.out.println(list);

       Object[] objarr= list.toArray();
        System.out.println(objarr);
    }

    public void addTwoLists(){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Cherry");
        fruits.add("Orange");

        ArrayList<String> veggies = new ArrayList<>();
        veggies.add("Potato");
        veggies.add("Onion");
        veggies.add("Spinach");


         // contains functions
        System.out.println(fruits.contains("Orange"));
        System.out.println(fruits);
        System.out.println(veggies);

        fruits.addAll(0,veggies);
        System.out.println(fruits);
        System.out.println(veggies);

        fruits.remove(0);
        System.out.println(fruits);
        fruits.removeAll(veggies);
        System.out.println(fruits);
    }

    public void iterateOverList(){
        /*
           9 ways to iterate
           for loop
           enhance forloop
           while loop
           for-each loop
           Iterator
           List Iterator
           Lambda expression
           Stream api -> lambda expression
           enumeration interface
         */
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Cherry");
        fruits.add("Orange");
        System.out.println("===== Using for loop  ====");
        for(int i=0; i<=fruits.size()-1; i++){
            System.out.print(fruits.get(i)+" ");
        }
        System.out.println();
        System.out.println("==== Enhanced for loop ====");

        for(String fruit: fruits){
            System.out.print(fruit+" ");
        }

        System.out.println();
        System.out.println("==== Using While loop ====");

        int i=0;
        while(i<=fruits.size()-1){
            System.out.print(fruits.get(i)+" ");
            i++;
        }

    }
}
