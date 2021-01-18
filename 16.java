/*
- (c) github.com/tanujdey7 
- MIT License
- Contact for code review
*/
class demo {
    public static void main(String[] args) {
        // Primitive Data types;
        int a = 10;
        byte b = 1;
        boolean bo = true;
        char c = 'c';
        double d = 10.10101;
        float f = 10.1f;

        // Wrapper class;
        Integer p = Integer.valueOf(a); // new Integer(a); will also work
        Double q = Double.valueOf(d);
        Float r = Float.valueOf(f);
        Character s = new Character(c);
        Boolean t = new Boolean(bo);
        Byte u = new Byte(b);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(s);
        System.out.println(t);
        System.out.println(u);
    }
}