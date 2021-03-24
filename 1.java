import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class Student {
    public static void main(String[] args) {
        int m1[] = {99,66,88};
        int m2[] = {77,66,88};
        int m3[] = {95,66,88};
        int m4[] = {90,66,88};
        int m5[] = {54,66,88};
        LinkedList<Integer> std_id = new LinkedList<Integer>();
        std_id.add(12345);
        std_id.add(34577);
        std_id.add(10385);
        std_id.add(67341);
        std_id.add(98452);
        LinkedList<String> std_name = new LinkedList<String>();
        std_name.add("Tanuj");
        std_name.add("Dhoni");
        std_name.add("Ronaldo");
        std_name.add("Kohli");
        std_name.add("Messi");
        LinkedList<Integer> total = new LinkedList<Integer>();
        total.add(Arrays.stream(m1).sum());
        total.add(Arrays.stream(m2).sum());
        total.add(Arrays.stream(m3).sum());
        total.add(Arrays.stream(m4).sum());
        total.add(Arrays.stream(m5).sum());
        for (int i = 0; i < std_id.size(); i++) {
            System.out.println("Student ID: "+std_id.get(i));
            System.out.println("Student Name: "+std_name.get(i));
            System.out.println("Student Total: "+total.get(i));
            System.out.println();
        }
        int c = 0;
        for (int i = 0; i < std_name.size(); i++) {
            if(std_name.get(i) == args[0]) {
                c = i;
            }
        }
        System.out.println("Student ID: "+std_id.get(c));
        System.out.println("Student Name: "+std_name.get(c));
        System.out.println("Student Total: "+total.get(c));
        System.out.println();
    }
}