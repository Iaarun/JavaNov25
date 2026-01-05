package polymorphismdemo;

public class A {
    public static void main(String[] args){
        A a = new A();
        a.m1("PQR", "XYZ"); //Two
        a.m1("ABC"); // one

    }

    void m1(String x){
        System.out.println("One");
    }
    protected void m1(String x, String y){
        System.out.println("Two");
    }
}
