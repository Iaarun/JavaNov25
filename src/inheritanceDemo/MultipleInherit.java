package inheritanceDemo;

public class MultipleInherit implements InterfaceB, InterfaceC {
    @Override
    public void methodA() {
        System.out.println("Implementation of methodA from InterfaceA");
    }

    @Override
    public void methodB() {
        System.out.println("Implementation of methodB from InterfaceB and InterfaceC");
    }

    public static void main(String[] args) {
        MultipleInherit obj = new MultipleInherit();
        obj.methodA();
        obj.methodB();
    }
}
