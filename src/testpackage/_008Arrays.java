package testpackage;

import java.util.Arrays;
/*
  store primitive or object
  contiguous memory location
  fixed length
  array index starts from 0 to size-1
 */
public class _008Arrays {

    public static void main(String[] args) {
        _008Arrays obj = new _008Arrays();
        obj.twoDimensionalArray();
    }

    public void arraybasic(){
        // array declartion and initialization
        // datatype[] arrayName = new datatype[size];
        int[] numbers = new int[5]; // Declaration and initialization of an integer array of size 5
        // max value of array index = size-1
        System.out.println(numbers);
        // toString representation of array
        System.out.println(Arrays.toString(numbers));
        // assigning values to array elements
        numbers[0]=15;
        numbers[1]=70;
        numbers[2]=50;
        numbers[3]=54;
        numbers[4]=30;
        System.out.println(Arrays.toString(numbers));
     //   Arrays.fill(numbers,10);
      //  System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[4]); // accessing array element at index 4

        System.out.println(numbers.length);// length property to get size of array
       // for loop to iterate over array element and normal for loop works on indexes
       for(int i=0; i<numbers.length;i++){
           System.out.println("Element at index "+i+" is: "+numbers[i]);
       }
        System.out.println("==============");
        // enhanced for loop to iterate over array elements directly
        for(int num:numbers){
            System.out.println("Element is: "+num);
        }

     int [] num = new int[]{12,15,64};  // arrayliteral
        System.out.println(Arrays.toString(num));
    }

    public void twoDimensionalArray(){
        // 2d array   first number represent rows and second number represent columns
        int[][] numbers= new int [3][5];
        System.out.println(numbers);

        numbers[0][0]=10;
        numbers[0][1]=20;
        numbers[0][2]=30;
        numbers[0][3]=40;
        numbers[0][4]=50;
        numbers[1][0]=15;
        numbers[1][1]=25;
        numbers[1][2]=35;
        numbers[1][3]=45;
        numbers[1][4]=55;
        numbers[2][0]=12;
        numbers[2][1]=22;
        numbers[2][2]=32;
        numbers[2][3]=42;
        numbers[2][4]=52;
        System.out.println(Arrays.toString(numbers)); // shallow representation
        System.out.println(Arrays.deepToString(numbers));
    }
}
