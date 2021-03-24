import java.io.*;
import java.util.*;

class Employee_Salary {

  int emp_code;
  String emp_name;
  int basic_sal;
  int gross_sal;
  int ma;

  Employee_Salary(int code, String name, int bs) {
    this.emp_code = code;
    this.emp_name = name;
    this.basic_sal = bs;
    ma = (bs - (bs * 30) / 100);
    gross_sal = (ma - (ma * 20) / 100);
  }

  public static void main(String args[]) {
    ArrayList<Employee_Salary> lst = new ArrayList<Employee_Salary>();
    lst.add(new Employee_Salary(101, "Tanuj", 20000));
    lst.add(new Employee_Salary(102, "Virat", 10000));
    for (Employee_Salary e : lst) {
      System.out.println("\n---Employee : " + e.emp_code + " -------");
      System.out.println("Name : " + e.emp_name);
      System.out.println("Basic Salary : " + e.basic_sal);
      System.out.println("M.A. Salary : " + e.ma);
      System.out.println("Gross Salary : " + e.gross_sal);
    }
  }
}
