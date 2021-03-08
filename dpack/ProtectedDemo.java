package dpack;

import cpack.C;
import bpack.B;

public class ProtectedDemo {
    public static void main(String[] args) {
        C c = new C();
        B b = new B();
        c.display();
        b.display();
    }
}
