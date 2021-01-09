package apack;

public class A {
    public String s1 = "Package A";
    private int a = 123;
    protected String s2 = "Tanuj";

    public void display() {
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(a);
    }

    /* Private variable cannot be accessed outside the scope of the class */
    public int private_variable() {
        return a;
    }
}
