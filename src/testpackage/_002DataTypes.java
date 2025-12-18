package testpackage;

public class _002DataTypes {
    public static void main(String[] args) {

     byte byteVar = 127;
     System.out.println("Byte Value: " + byteVar);

  //   Integer.toBinaryString(byteVar);
     System.out.println("Byte in Binary: " + Integer.toBinaryString(byteVar));
     int intVar = 32767;
        System.out.println("Integer Value: " + intVar);
        float floatVar = 10.51646f;

        double doubleVar = 20.2564654;
        System.out.println("Double Value: " + doubleVar);
        char charVar = '4';
        System.out.println("Character Value: " + charVar);
        boolean boolVar = true;
        System.out.println("Boolean Value: " + boolVar);

        // Typecasting
        byte bytevariable= 15;
        int intFromByte = bytevariable; // Implicit casting

        System.out.println("Integer from Byte (Implicit Casting): " + intFromByte);

        int intVariable = 126;
        byte byteFromInt = (byte) intVariable; // Explicit casting
        System.out.println("Byte from Integer (Explicit Casting): " + byteFromInt);

        float floatVariable = 10.99f;
        int intFromFloat = (int) floatVariable; // Explicit casting
        System.out.println("Integer from Float (Explicit Casting): " + intFromFloat);

        double doubleVariable = floatVariable; // Implicit casting
        System.out.println("Double from Float (Implicit Casting): " + doubleVariable);

        double largeDouble = 12345.67894345435549449464949345456549;
        float floatFromDouble = (float) largeDouble; // Explicit casting
        System.out.println("Float from Double (Explicit Casting): " + floatFromDouble);
        boolean boolVariable = false;
        // int intFromBool = (int) boolVariable; // Not allowed

    }
}
