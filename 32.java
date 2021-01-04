import java.util.Scanner;

class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}

class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 & 2: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            System.out.println("Answer: " + (a / b));

        } catch (ArithmeticException e) {
            System.out.println(e);
            System.exit(0);
        }
        try {
            if (b > a) {
                throw new MyException("Denominator greater than numerator");
            } else {
                System.out.println("Answer: " + (a / b));
            }
        } catch (MyException e) {
            System.out.println(e);
        } finally {
            sc.close();
            System.out.println("Thank You");
        }
    }
}