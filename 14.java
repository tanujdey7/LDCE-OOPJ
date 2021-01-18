/*
- (c) github.com/tanujdey7 
- MIT License
- Contact for code review
*/
class Rectangle {
    int length;
    int width;
    static int count;

    Rectangle() /* Default Constructor */ {
        System.out.println("Default Constructor");
        length = 2;
        width = 3;
    }

    Rectangle(int length, int width) /* Parameterized Constructor */ {
        System.out.println("Constructor Overloaded");
        this.length = length;
        this.width = width;
    }

    Rectangle(Rectangle r) /* Copy Constructor */ {
        System.out.println("Constructor Copied!!");
        length = r.length;
        width = r.width;
    }

    {
        count++;
        System.out.println("Initialization block(it is executed whenever a instance/object is created):" + count);
        System.out.println();
    }
    static {
        count++;
        System.out.println("Static block is always executed first: " + count);
        System.out.println();
    }

    void display() {
        System.out.println("Area: " + (length * width));
        System.out.println();
    }

    public static void main(String[] args) {
        Rectangle obj2 = new Rectangle(5, 10);
        obj2.display();
        System.out.println("Main block gets executed second\n");
        Rectangle obj1 = new Rectangle();
        obj1.display();
    }
}