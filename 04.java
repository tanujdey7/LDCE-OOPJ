/*
- (c) github.com/tanujdey7 
- MIT License
- Contact for code review
*/
import java.util.Scanner;

class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x = sc.nextInt();
        System.out.print("Enter Power: ");
        int n = sc.nextInt();
        System.out.println((int)Math.pow(x, n));
    }
}