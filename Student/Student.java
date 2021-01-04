package Student;

import java.util.HashMap;

public class Student {
    HashMap<Integer, String> map = new HashMap<Integer, String>();
    int roll;
    String name;

    public Student(int roll) {
        map.put(1, "Tanuj");
        map.put(2, "Virat");
        map.put(7, "Dhoni");
        map.put(4, "Messi");
        map.put(5, "Elon Musk");
        this.roll = roll;
        name = map.get(roll);
    }

    public String display() {
        return name;
    }
}
