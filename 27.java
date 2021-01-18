/*
- (c) github.com/tanujdey7 
- MIT License
- Contact for code review
*/
class Number_1<N> {
    N obj;

    Number_1(N obj) {
        this.obj = obj;
    }

    N display() {
        return obj;
    }
}

class Driver {
    public static void main(String[] args) {
        Number_1<Integer> n1 = new Number_1<Integer>(123);
        System.out.println(n1.display());
        Number_1<Float> n2 = new Number_1<Float>(123.12f);
        System.out.println(n2.display());
    }
}