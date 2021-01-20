class a extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("A");
        }
    }
}

class b extends Thread {
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("B");
        }
    }
}

class c extends Thread {
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("C");
        }
    }
}

class demo {
    public static void main(String[] args) {
        Thread a = new a();
        Thread b = new b();
        Thread c = new c();
        a.start();
        b.start();
        c.start();
    }
}