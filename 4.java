import java.util.Scanner;

class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x = sc.nextInt();
        System.out.print("Enter Power: ");
        int n = sc.nextInt();
        System.out.println(Math.pow(x, n));
    }
}