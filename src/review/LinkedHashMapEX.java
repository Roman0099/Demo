package review;

import java.util.LinkedHashMap;

public class LinkedHashMapEX {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String>map = new LinkedHashMap<>();
        map.put(4, "four");
        map.put(null, "this is null");
        map.put(2,"two");
        map.put(1,"one");
        System.out.println(map);
    }
}
