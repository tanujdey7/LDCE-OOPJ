/*
- (c) github.com/tanujdey7 
- MIT License
- Contact for code review
*/
import java.util.Scanner;

class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean flag = false;
        System.out.print("Enter Starting Number: ");
        int x = sc.nextInt();
        System.out.print("Enter Ending Number: ");
        int y = sc.nextInt();
        System.out.print("Fibonacci Series: ");
        for (int i = x; i <= y; i++) {
            System.out.print((num += i) + " ");
        }
        System.out.println();
        if (x == 0 && y == 1) {
            System.out.println("Prime Series: N/A");
        } else {
            System.out.print("Prime Series: ");
            for (int i = x; i <= y; i++) {
                if (i == 0 || i == 1) {
                    continue;
                }
                flag = false;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % 2 == 0) {
                        flag = true;
                        break;
                    }
                }
                if (flag == false) {
                    System.out.print(i + " ");
                }
            }
        }
        sc.close();
    }
}