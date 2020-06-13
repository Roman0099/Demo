package review;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {


    TreeMap<Integer, String> map = new TreeMap<>();
        map.put(4, "four");
        map.put(3, "this is null");
        map.put(2,"two");
        map.put(1,"one");
        System.out.println(map);
}
}
