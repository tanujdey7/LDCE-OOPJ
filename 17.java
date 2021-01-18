/*
- (c) github.com/tanujdey7 
- MIT License
- Contact for code review
*/
class demo {
    int count = 0;
    int radius;

    demo() {
        this(3);
        count++;
    }

    demo(int r) {
        this(3.14f, r);
        count++;
    }

    demo(float pi, int r) {
        count++;
        System.out.println("Area of a Circle: " + pi * Math.pow(r, 2) + "\nNumber of instances/object: " + count);

    }

    public static void main(String[] args) {
        new demo();
    }
}