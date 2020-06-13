package collection;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
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
