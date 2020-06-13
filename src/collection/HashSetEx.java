package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String>list = new HashSet<>();
        list.add("Liam");
        list.add("Nataliia");
        list.add("Ira");
        list.add("Peter");
        list.add("John");
        list.add("Liam");
        //Traversing list through iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());


        }
    }
}




