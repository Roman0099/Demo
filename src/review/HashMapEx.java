package review;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Selenium");
        map.put(2, "Java");
        map.put(3, "null");
        System.out.println(map.get(2));
        System.out.println(map.get(4));

        for (Map.Entry r : map.entrySet()) {
            System.out.println(r.getKey() + " " + r.getValue());

        }
        HashMap<Integer, Employee> emp = new HashMap<>();
        Employee em1 = new Employee("Tom", 25, "admin");
        Employee em2 = new Employee("Pete", 26, "QA");
        Employee em3 = new Employee("John", 27, "BA");
        emp.put(1, em1);
        emp.put(2, em2);
        emp.put(3, em3);
        for (Map.Entry e : emp.entrySet()) {

            System.out.println(e.getKey() + "" + e.getValue());

        }
    }
}
