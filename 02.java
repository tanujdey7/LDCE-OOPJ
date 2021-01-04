import java.util.Scanner;

class demo {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(num += i);
        }
    }
}