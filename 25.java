import Student.*;
import Exam.*;
import java.util.Scanner;

class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Rollno: ");
        int roll = sc.nextInt();

        Student s = new Student(roll);
        System.out.println("Name: " + s.display());
        Result r = new Result(roll);
        System.out.println("Marks Scored: " + r.display());
        sc.close();
    }
}