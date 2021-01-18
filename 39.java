import java.io.File;
import java.io.FileOutputStream;

/*
- (c) github.com/tanujdey7 
- MIT License
- Contact for code review
*/
class demo {
    public static void main(String[] args) throws Exception {
        File file = new File("D:/java/cpack/39.txt");
        FileOutputStream fout = new FileOutputStream(file);
        String str = "Hello World";
        byte b[] = str.getBytes();
        fout.write(b);
        System.out.println("File Created");
        fout.close();
    }
}