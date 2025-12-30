package inheritanceDemo;
// Mechanical class inherits from Engineer class
// Computer Science class also inherits from Engineer class
// example  of hierarchical inheritance
public class Mechanical extends Engineer {

    public void design(){
        System.out.println("Mechanical Engineer is designing");
    }

    public static void main(String[] args) {

        Mechanical mech = new Mechanical();
        mech.design(); // Method from Mechanical class
        mech.work();   // Inherited method from Engineer class

    }
}
