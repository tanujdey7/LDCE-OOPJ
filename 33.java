import java.util.Scanner;

class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}

class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.print("Enter amount to deposit: ");
            int bal = sc.nextInt();
            int w = 0;
            while (true) {
                System.out.print("Enter amount to withdraw: ");
                w = sc.nextInt();
                bal -= w;
                System.out.println("Your balance is: " + bal);
                if (bal < 0) {
                    throw new MyException("Not Sufficient Funds");
                }
            }
        } catch (MyException e) {
            System.out.println(e);
        } finally {
            sc.close();
        }

    }
}