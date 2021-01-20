import java.security.spec.EdECPoint;

/*
  Copyright (c) github.com/tanujdey7 
  MIT License - Free to use
 */
class demo extends Thread {
    public void run() {
        try {
            System.out.println("Thread class extended");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        demo d = new demo();
        d.start();
    }
}