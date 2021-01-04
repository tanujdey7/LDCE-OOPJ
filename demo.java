import java.util.HashMap;

public class demo {

    HashMap<Integer, String> map = new HashMap<Integer, String>();
    int roll;
    String str;

    public demo(int roll) {
        map.put(1, "Tanuj");
        map.put(2, "Virat");
        map.put(7, "Dhoni");
        map.put(4, "Messi");
        map.put(5, "Elon Musk");
        this.roll = roll;
        str = map.get(roll);
    }

    public String display() {
        System.out.println(map);
        return str;
    }

    public static void main(String[] args) {
        demo d = new demo(7);
        System.out.println(d.display());
    }
}
