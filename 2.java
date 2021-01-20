/*
  Copyright (c) github.com/tanujdey7 
  MIT License - Free to use
 */
class demo extends Thread {
    public void run() {
        try {
            System.out.println("Runnable interface called");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        demo d = new demo();
        Thread t = new Thread(d);
        t.start();
    }
}