package collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {
    public static void main(String[] args) {
         StreamExamples examples = new StreamExamples();
         examples.convertUppercase();
    }

    public void findEvenNo(){
        List<Integer> numbers = Arrays.asList(1,2,75,24,62,35,64,100,624);
        System.out.println(numbers);
        List<Integer> even = new ArrayList<>();
        for(Integer num:numbers){
            if (num%2==0){
                even.add(num);
            }
        }
        System.out.println(even);
       List<Integer> evenNu= numbers.stream().filter(num-> num%2==0).collect(Collectors.toList());
        System.out.println(evenNu);
    }

    public void convertUppercase(){
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "kiwi","apple", "kiwi");
        List<String> upcase = new ArrayList<>();
        for(String fr: fruits){
             upcase.add( fr.toUpperCase());
        }
        System.out.println(upcase);
        upcase=  fruits.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upcase);

     upcase=   fruits.stream().distinct().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upcase);
    }
}
