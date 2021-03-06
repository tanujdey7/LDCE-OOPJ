/*
- (c) github.com/tanujdey7 
- MIT License
- Contact for code review
*/
class Student {
    int enrollment_number, marks;
    String gender, name;
    static int objectCount = 0;

    Student(String name, String gender, int enrollment_no, int marks) {
        this.enrollment_number = enrollment_no;
        this.marks = marks;
        this.name = name;
        this.gender = gender;
        objectCount++;
    }

    void display() {
        System.out.println("Student Enrollment No: " + enrollment_number);
        System.out.println("Student Marks: " + marks);
        System.out.println("Student Name: " + name);
        System.out.println("Student Gender: " + gender);
        System.out.println();
    }

    public static void main(String[] args) {
        Student student1 = new Student("Tanuj", "Male", 151635, 100);
        Student student2 = new Student("Virat Kohli", "Male", 18, 99);
        Student student3 = new Student("Lionel Messi", "Male", 10, 70);
        student1.display();
        student2.display();
        student3.display();
        System.out.println();
        System.out.println("Count of Object: " + objectCount);
    }
}