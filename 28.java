import java.util.Scanner;

class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        char c[] = str.toCharArray();
        boolean flag = true;
        for (int i = 0; i < c.length; i++) {
            if (!Character.isUpperCase(c[i])) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("String is in Uppercase");
            System.out.println("Connverted to Lowercase: " + str.toLowerCase());
        } else {
            System.out.println("String is in Lowercase");
            str.toUpperCase();
            System.out.println("Connverted to Uppercase: " + str.toUpperCase());
        }
        sc.close();
    }
}