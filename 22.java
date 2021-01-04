class A {
    static int x = 10;
}

class B extends A {
    int x = 20;

    void display() {
        System.out.println("Class B variable: " + x);
        System.out.println("Class A variable: " + super.x);
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}