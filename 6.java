class Account extends Thread {
    int num;

    public synchronized void access() {
        num++;
    }
}

class demo {
    public static void main(String[] args) throws Exception {
        Account a = new Account();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    a.access();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    a.access();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(a.num);
    }
}