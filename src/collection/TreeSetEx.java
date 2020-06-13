package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<String>list = new TreeSet<>();
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



