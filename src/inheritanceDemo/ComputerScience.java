package inheritanceDemo;

public class ComputerScience extends Engineer {

    public void code(){
        System.out.println("Computer Science Engineer is coding");
    }

    public static void main(String[] args) {

        ComputerScience cs = new ComputerScience();
        cs.code(); // Method from ComputerScience class
        cs.work(); // Inherited method from Engineer class

    }
}
