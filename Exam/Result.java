package Exam;

import java.util.HashMap;

public class Result {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int roll;
    int marks;

    public Result(int roll) {
        map.put(1, 100);
        map.put(2, 83);
        map.put(7, 77);
        map.put(4, 93);
        map.put(5, 71);
        this.roll = roll;
        marks = map.get(roll);
    }

    public int display() {
        return marks;
    }
}
