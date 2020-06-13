package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<String>list = new LinkedHashSet<>();
        list.add("Liam");
        list.add("Nataliia");
        list.add("Ira");
        list.add("Peter");
        list.add("John");
        list.add("Liam");
        list.add("null");
        //Traversing list through iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());


        }
    }
}



