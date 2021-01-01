import java.util.Scanner;

class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1:");
        int a = sc.nextInt();
        System.out.print("Enter Number 2:");
        int b = sc.nextInt();
        System.out.print("Enter Number 3:");
        int c = sc.nextInt();
        System.out.print("Enter Number 4:");
        int d = sc.nextInt();
        if (a > b && a > c && a > d) {
            System.out.println("Number 1 is the greatest");
        } else if (b > a && b > c && b > d) {
            System.out.println("Number 2 is the greatest");
        } else if (c > a && c > b && c > d) {
            System.out.println("Number 3 is the gratest");
        } else {
            System.out.println("Number 4 is the greatest");
        }
    }
}
