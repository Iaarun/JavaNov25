package collectiondemo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayListDemo demo = new ArrayListDemo();
      //  demo.arrayListExample();
        demo.arrayListOperations();
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


        // Accessing elements using get()
        String firstItem = list.get(2);
        System.out.println("First item: " + firstItem);
        //to find the size of an arraylist
        int size = list.size();
        System.out.println("Size of the list: " + size);


    }
}
