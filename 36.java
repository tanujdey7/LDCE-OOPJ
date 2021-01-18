import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/*
- (c) github.com/tanujdey7 
- MIT License
- Contact for code review
*/

class Driver {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout;
        FileInputStream fin;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Create File");
        System.out.println("2. Read File");
        System.out.println("3. Modify File");
        int ch = sc.nextInt();
        if (ch == 1) {
            System.out.print("Enter File Name: ");
            sc.nextLine();
            String filename = sc.nextLine();
            File file = new File(filename);
            if (!file.exists()) {
                System.out.print("Enter Content: ");
                String str = sc.nextLine();
                fout = new FileOutputStream(filename);
                byte b[] = str.getBytes();
                fout.write(b);
                System.out.println("File Successfully created");
                fout.close();
            } else {
                System.out.println("File Already Exists");
            }
        } else if (ch == 2) {
            System.out.print("Enter File Name to read: ");
            sc.nextLine();
            String filename = sc.nextLine();
            File file = new File(filename);
            if (file.exists()) {
                fin = new FileInputStream(filename);
                int i = 0;
                while ((i = fin.read()) != -1) {
                    System.out.print((char) i);
                }
                System.out.println("\nFile Successfully read");
                fin.close();
            } else {
                System.out.println("File Does not exist");
            }
        } else {
            System.out.print("Enter File Name to modify: ");
            sc.nextLine();
            String filename = sc.nextLine();
            File file = new File(filename);
            if (file.exists()) {
                fout = new FileOutputStream(filename);
                System.out.print("Enter String: ");
                sc.nextLine();
                String str = sc.nextLine();
                byte b[] = str.getBytes();
                fout.write(b);
                System.out.println("File Modified Successfully");
            } else {
                System.out.println("File Does not exist");
            }
        }
        sc.close();
    }
}
