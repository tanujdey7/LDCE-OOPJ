class demo {
    int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        demo d1 = new demo();
        int num = 5;
        System.out.println(d1.fact(num));
    }
}