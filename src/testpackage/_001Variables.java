package testpackage;
/*
 Variables is the name associated to the space in memory that stores data.
types of variables:
  local variable = declared inside a method/costructor/block. Acceesible with in that block/method
   instance variable = declared inside a class but outside any method/constructor/block. Accessible by creating object of the class
   static/class variable = declared with static keyword inside a class but outside any method/constructor/block. Accessible without creating object of the class
 */
public class _001Variables {
    // Instance variable
    int instanceVar = 30; // Accessible by creating object of the class
   static String course   = "Selenium";
   String name;
    public static void main(String[] args) {
        // Variable declaration and initialization
        // datatype variableName = value;
        //declaration & initialization
        int num =20;

     //   System.out.println("calling local variable: "+localvar); not accessible here
        // Creating an object to access instance variable
        _001Variables clsObj = new _001Variables();
    //    System.out.println(clsObj.instanceVar);
        clsObj.name="Rohit";
       // System.out.println(course);
     //   System.out.println(_001Variables.course);
    //    System.out.println(clsObj.name);
        _001Variables clsObj1 = new _001Variables();
        clsObj1.name="Sachin";
         clsObj1.course="Java";

        System.out.println(clsObj.name);//Virat //Rohit
        System.out.println(clsObj.course);  //Java
        System.out.println(clsObj1.name); //Sachin
        System.out.println(_001Variables.course); //Java

    }

    public void localVariableExample() {
        // Local variable
        int localVar = 10; // Accessible only within this method
        System.out.println("Local Variable: " + localVar);
        _001Variables clsObj = new _001Variables();
        System.out.println("Instance Variable from localVariableExample method: " + clsObj.instanceVar);
        System.out.println(course);
        System.out.println(_001Variables.course);
    }
// iteratre over the strig charcters

}
