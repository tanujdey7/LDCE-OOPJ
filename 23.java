import java.util.Scanner;

class Driver {
    public static void main(String[] args) {
        System.out.println("Find area of?\n1. Triangle\n2. Rectangle\n3. Circle");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        if (ch == 1) {
            System.out.print("Enter base: ");
            int b = sc.nextInt();
            System.out.print("Enter altitute: ");
            int a = sc.nextInt();
            Triangle t = new Triangle();
            t.area(a, b);
        } else if (ch == 2) {
            System.out.print("Enter length: ");
            int b = sc.nextInt();
            System.out.print("Enter breadth: ");
            int a = sc.nextInt();
            Rectangle r = new Rectangle();
            r.area(a, b);
        } else {
            System.out.print("Enter radius: ");
            int a = sc.nextInt();
            int b = a;
            Circle c = new Circle();
            c.area(a, b);
        }
        sc.close();
    }

}

abstract class Shape {
    int a;
    int b;

    abstract void area(int a, int b);
}

class Triangle extends Shape {

    void area(int a, int b) {
        this.a = a;
        this.b = a;
        System.out.println("Area of Triangle: " + (0.5 * a * b));
    }
}

class Rectangle extends Shape {
    void area(int a, int b) {
        this.a = a;
        this.b = a;
        System.out.println("Area of rectangle: " + (a * b));
    }
}

class Circle extends Shape {
    void area(int a, int b) {
        this.a = a;
        this.b = a;
        System.out.println("Area of Circle: " + (3.14 * a * b));
    }
}
