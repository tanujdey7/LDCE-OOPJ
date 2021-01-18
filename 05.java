
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
        int num = sc.nextInt();
        int n;
        int answer = 0;
        int temp = num;
        while (num != 0) {
            n = num % 10;
            answer += Math.pow(n, 3);
            num /= 10;
        }
        if (answer == temp)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}