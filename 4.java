class thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0)
                System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}

class thread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 1)
                System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}

class demo {
    public static void main(String[] args) {
        Thread t1 = new thread1();
        Thread t2 = new thread2();
        t1.start();
        t2.start();
    }
}