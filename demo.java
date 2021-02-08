class count {
    int count;

    void display() {
        count++;
    }
}

class demo extends Thread {
    public static void main(String[] args) throws Exception {
        count c = new count();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 2000; i++) {
                    c.display();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 2000; i++) {
                    c.display();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}