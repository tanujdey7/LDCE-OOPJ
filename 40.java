import java.io.FileInputStream;
class demo {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("hello.txt");
        int i = 0;
        while ((i = fin.read()) != -1) {
            System.out.print((char) i);
        }
        System.out.println("\nFile Successfully read");
        fin.close();

    }
}
