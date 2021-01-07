final class Demo {
    final float pi = 3.14f;
    // pi=3.1428; /* Final keyword cannot be overloaded*/

    /* Final method cannot be overridden */
    final void display() {
        System.out.println("Value of Pi is: " + pi);
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
    }
}

/* Final class cannot be inherited */
// class Driver extends Demo {
// public static void main(String[] args) {
// Demo d = new Demo();
// d.display();
// }
// }