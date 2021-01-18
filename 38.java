import java.io.File;

class demo {
    public static void main(String[] args) throws Exception {
        File file = new File("36.java");
        if (file.exists()) {
            System.out.println("File Exists");
        } else {
            System.out.println("File doesnt exist`");
        }
    }
}