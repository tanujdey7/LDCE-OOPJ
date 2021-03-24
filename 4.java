import java.util.*;

class Student {

  int stu_id;
  String name;
  int[] marks = new int[5];
  int total_mark;

  Student(int stu_id, String name, int[] marks, int sum) {
    this.stu_id = stu_id;
    this.name = name;
    this.marks = marks;
    this.total_mark = sum;
  }
}

class demo implements Comparator<Student> {

  public int compare(Student s1, Student s2) {
    return s1.name.compareTo(s2.name);
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    List<Student> lst = new LinkedList<Student>();
    int sum = 0;
    int[] mark = new int[5];
    for (int j = 0; j < 5; j++) {
      System.out.print("Enter " + (j + 1) + " marks : ");
      mark[j] = s.nextInt();
      sum += mark[j];
    }
    Student s1 = new Student(1, "Tanuj", mark, sum);
    Student s2 = new Student(2, "Virat", mark, sum);
    lst.add(s1);
    lst.add(s2);
    System.out.println(
      " ------------------   Sorting by Name   --------------"
    );
    Collections.sort(lst, new demo());
    for (Student stu : lst) {
      System.out.println("\n---Student : " + stu.stu_id + " -------");
      System.out.println("Name : " + stu.name);
      System.out.println("Total Marks : " + stu.total_mark);
      System.out.println("Marks : ");
      for (int k = 0; k < 5; k++) System.out.print(stu.marks[k] + "\t");
    }
  }
}