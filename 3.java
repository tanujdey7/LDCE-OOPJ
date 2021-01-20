class thread1 extends Thread {
    public void run() {
        try {
            while (true) {
                Thread.sleep(2000);
                System.out.println("Thread1");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class thread2 extends Thread {
    public void run() {
        try {
            while (true) {
                Thread.sleep(4000);
                System.out.println("Thread2");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class demo {
    public static void main(String[] args) {
        System.out.println("Ctrl + C to exit");
        Thread t1 = new thread1();
        Thread t2 = new thread2();
        t1.start();
        t2.start();
    }
}