package exam;
import java.io.FileOutputStream;
import java.util.Scanner;

class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}
class Rectangle {
    int l,b;
    Rectangle(int l,int b) {
        this.l = l;
        this.b = b;
    }
    void display() {
        try {
            FileOutputStream fout = new FileOutputStream("rectangle.dat");
            int ans = l * b;
            String s = String.valueOf(ans);
            byte b[] = s.getBytes();
            fout.write(b);
            System.out.println("File Created");
            fout.close();
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
}
class Circle {
    int l;
    Circle(int l) {
        this.l = l;
        }
    void display() {
        try {
            FileOutputStream fout = new FileOutputStream("circle.dat");
            float ans = l * 2 * 3.14f;
            String s = String.valueOf(ans);
            byte b[] = s.getBytes();
            fout.write(b);
            System.out.println("File Created");
            fout.close();
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
}
class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        try {
            if(l == 0 || b == 0) {
                throw new MyException("Enter number greater than 0");
            }
            Rectangle r = new Rectangle(l,b);
            Circle c = new Circle(l);
            r.display();
            c.display();
        }
        catch(MyException e) {
            System.out.println("Exception "+e.getMessage());
        }

    }

}