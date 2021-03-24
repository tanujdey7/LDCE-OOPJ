import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
class demo {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("hello.txt");
        
        int count = 0;
        File f = new File("hello.txt");
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()) {
            sc.nextLine();
            count++;
        }
        System.out.println(count);
        fin.close();
        sc.close();

    }
}

