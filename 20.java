/*
- (c) github.com/tanujdey7 
- MIT License
- Contact for code review
*/
import java.util.Scanner;

class Driver {
    public static void main(String[] args) {
        System.out.println(
                "Enter 1. To Check Balance\nEnter 2. To Deposit\nEnter 3. To Withdraw\nEnter 4. Exit\n------------------------------------------");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println(
                        "Select Account type: \n1. Savings\n2. Current\n------------------------------------------");
                int a = sc.nextInt();
                if (a == 1) {
                    Savings s = new Savings();
                    s.display();
                } else {
                    Current current = new Current();
                    current.display();
                }
                break;
            case 2:
                System.out.println(
                        "Select Account type: \n1. Savings\n2. Current\n------------------------------------------");
                int b = sc.nextInt();
                if (b == 1) {
                    Savings s = new Savings();
                    System.out.println("\n------------------------------------------");
                    s.display();
                    System.out.print("Enter money to deposit: ");
                    int d = sc.nextInt();
                    s.deposit(d);
                } else {
                    Current current = new Current();
                    System.out.println("\n------------------------------------------");
                    current.display();
                    System.out.print("Enter money to deposit: ");
                    int d = sc.nextInt();
                    current.deposit(d);
                }
                break;
            case 3:
                System.out.println(
                        "Select Account type: \n1. Savings\n2. Current\n------------------------------------------");
                int c = sc.nextInt();
                if (c == 1) {
                    Savings s = new Savings();
                    System.out.println("\n------------------------------------------");
                    s.display();
                    System.out.print("Enter money to withdraw: ");
                    int w = sc.nextInt();
                    s.deposit(w);
                } else {
                    Current current = new Current();
                    System.out.println("\n------------------------------------------");
                    current.display();
                    System.out.print("Enter money to withdraw: ");
                    int w = sc.nextInt();
                    current.withdraw(w);
                }
                break;
            case 4:
                System.out.println("Thanks Visit Us Again.!");
                sc.close();
                System.exit(0);
            default:
                System.out.println("Invalid input... Bye!");
                sc.close();
                System.exit(0);
        }
    }
}

class Account {
    int accountNumber;
    int balance;

    Account(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class Savings extends Account {
    Savings() {
        super(1031142351, 123467);
    }

    int interestRate = 6;

    void withdraw(int w) {
        if (balance > w) {
            balance -= w;
            System.out.println("Transaction Successful\nYour Savings balance is Rs: " + balance);
            System.out.println("------------------------------------------");
        } else {
            System.out.println("Insufficient funds");
            System.out.println("------------------------------------------");
        }
    }

    void deposit(int d) {
        balance += d;
        System.out.println("Deposit Successful\nYour Savings balance is Rs: " + balance);
        System.out.println("------------------------------------------");
    }

    void display() {
        System.out.println("Account number: " + accountNumber + "\nSavings balance is Rs: " + balance
                + "\nWith Interest Rate of (in %): " + interestRate);
        System.out.println("------------------------------------------");
    }
}

class Current extends Account {
    int overdraftLimit = 5000;

    Current() {
        super(2018423343, 10);
    }

    void withdraw(int w) {
        if (balance > w) {
            balance -= w;
            System.out.println("Transaction Successful\nYour Current balance is Rs: " + balance);
            System.out.println("------------------------------------------");
        } else {
            if (w > overdraftLimit) {
                System.out.println("Overdraft Limit Exceeded, insufficient funds");
                System.out.println("------------------------------------------");
            } else {
                overdraftLimit -= w;
                System.out.println(
                        "Transaction Successful\nYour Current balance is Rs: (-)" + (overdraftLimit - balance));
                System.out.println("------------------------------------------");
            }
        }
    }

    void deposit(int d) {
        balance += d;
        System.out.println("Deposit Successful\nYour Current balance is Rs: " + balance);
        System.out.println("------------------------------------------");
    }

    void display() {
        System.out.println("Account number: " + accountNumber + "\nCurrent balance is Rs: " + balance
                + "\nWith overdraft limit of Rs: (-)" + overdraftLimit);
        System.out.println("------------------------------------------");
    }
}
