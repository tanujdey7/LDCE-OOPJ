package bpack;

import apack.A;

public class B extends A {
    A obj = new A();

    public void display() {
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(obj.private_variable());
    }
}
