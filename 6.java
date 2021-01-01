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
        if (a < b && a < c) {
            System.out.println("Number 1 is the smallest");
        } else if (b < a && b < c) {
            System.out.println("Number 2 is the smallest");
        } else {
            System.out.println("Number 3 is the smallest");
        }
    }
}
