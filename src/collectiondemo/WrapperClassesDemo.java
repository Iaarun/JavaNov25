package collectiondemo;

/*
    * Wrapper classes in Java provide a way to use primitive data types (int, char, etc.)
    int -> Integer
    double -> Double
    char -> Character
    boolean -> Boolean
    byte -> Byte
    short -> Short
    long -> Long
    float -> Float
 */
public class WrapperClassesDemo {
    public static void main(String[] args) {
        WrapperClassesDemo demo = new WrapperClassesDemo();
        demo.wrapperClassExample();
    }

    public void wrapperClassExample() {
        // Primitive data types and their corresponding wrapper classes
        int primitiveInt = 10;
        Integer wrapperInt = Integer.valueOf(primitiveInt); // AutoBoxing-> conversion of primitive to object
        int unboxedInt = wrapperInt.intValue(); // Unboxing -> conversion of object to primitive

        double primitiveDouble = 20.5;
        Double wrapperDouble = Double.valueOf(primitiveDouble); // Boxing
        double unboxedDouble = wrapperDouble.doubleValue(); // Unboxing

        char primitiveChar = 'A';
        Character wrapperChar = Character.valueOf(primitiveChar); // Boxing
        char unboxedChar = wrapperChar.charValue(); // Unboxing

        System.out.println("Primitive int: " + primitiveInt + ", Wrapper Integer: " + wrapperInt + ", Unboxed int: " + unboxedInt);
        System.out.println("Primitive double: " + primitiveDouble + ", Wrapper Double: " + wrapperDouble + ", Unboxed double: " + unboxedDouble);
        System.out.println("Primitive char: " + primitiveChar + ", Wrapper Character: " + wrapperChar + ", Unboxed char: " + unboxedChar);
    }
}
