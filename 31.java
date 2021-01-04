class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

class demo {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
            if (b == 0)
                throw new MyException("Divide by zero");
            else
                System.out.println(a / b);
        } catch (MyException e) {
            System.out.print(e + " Error");
        }
    }
}