class demo {
    public static void main(String[] args) {
        int k, n;
        char ch;
        String str = args[0];
        int len = str.length();
        for (char i = 'A'; i <= 'z'; i++) {
            k = 0;
            for (int j = 0; j < len; j++) {
                ch = str.charAt(j);
                if (ch == i) {
                    k++;
                }
            }
            if (k > 0) {
                System.out.println(i + " = " + k);
            }
        }
    }
}