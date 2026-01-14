package collectiondemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMapDemo demo = new HashMapDemo();
        demo.iterateOverHashMap();
    }

    public void demoHashMap() {
        HashMap <Integer, String> map = new HashMap<>(0);
        //to add elements to the map
        map.put(101,"Alice");
        map.put(102,"Bob");
        map.put(103,"Charlie");
        map.put(104,"Diana");
        map.put(105,"Ethan");

        System.out.println("Initial map: " + map);
        //to get value for a key
        System.out.println(map.get(102));
        //map size
        System.out.println("Map size: " + map.size());
        map.put(105,"Eva"); //updates value for key 105
        System.out.println("Updated map: " + map);
        map.putIfAbsent(106,"Frank"); //does not update as key 105 exists
        System.out.println("After putIfAbsent: " + map);

        System.out.println(map.get(107)); //returns null as key 107 does not exist
        System.out.println(map.getOrDefault(1,"Anonymous"));
        System.out.println(map);//returns default value
        //map.clear();
        System.out.println( map.remove(105));
        System.out.println(map.remove(105, "Diana")); //removes only if key 104 maps to Diana
           //to check if a key/value exists
        System.out.println( map.containsKey(109)); //true
        System.out.println(map.containsValue("Charlie")); //true
        System.out.println(map.isEmpty());
        System.out.println(map);
        // to get all keys from the map
        System.out.println(map.keySet());
        // to get all values from the map
        System.out.println(map.values());
        //putAll  to add one map to another
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(201,"George");
        map2.put(202,"Hannah");
        map.putAll(map2);
        System.out.println("After putAll: " + map);

    }

    public void iterateOverHashMap(){
        HashMap <Integer, String> map = new HashMap<>(0);
        //to add elements to the map
        map.put(101,"Alice");
        map.put(102,"Bob");
        map.put(103,"Charlie");
        map.put(104,"Diana");
        map.put(105,"Ethan");

        // iterate over keys
        System.out.println("===== Iterating over keys =====");
        for(Integer k : map.keySet()){
            System.out.print(k+" ");
        }

        System.out.println();
        System.out.println("===== Iterating over values =====");
        for(String str: map.values()){
            System.out.print(str+" ");
        }
        System.out.println();
        System.out.println("===== Iterating over key-value pairs using enhance forloop =====");

        for(Map.Entry<Integer, String> ent: map.entrySet()){
            System.out.println("Key: "+ent.getKey()+", Value: "+ent.getValue());

        }

        System.out.println("===== Iterating over key-value pairs using  forEach with lambda =====");

        map.forEach((k,v)->{
            System.out.println("Key: "+k+", Value: "+v);
        });

        System.out.println("===== Iterating over key-value pairs using stream =====");

        map.entrySet().stream().forEach(ent->{
            System.out.println("Key: "+ent.getKey()+", Value: "+ent.getValue());
        });

        System.out.println("===== Iterating over key-value pairs using iterator =====");
         Iterator<Map.Entry<Integer, String>> it= map.entrySet().iterator();
         while(it.hasNext()){
            Map.Entry<Integer, String> ent= it.next();
            System.out.println("Key: "+ent.getKey()+", Value: "+ent.getValue());
         }
    }
}
