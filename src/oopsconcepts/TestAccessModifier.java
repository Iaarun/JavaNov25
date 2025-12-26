package oopsconcepts;

import accessmodifiersdemo.Calculator;

public class TestAccessModifier extends Calculator {

    public static void main(String[] args) {
        TestAccessModifier test = new TestAccessModifier();
        test.protectedmethod();
        test.protectedmethod();
    }
}
