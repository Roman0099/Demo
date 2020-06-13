package collection;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeEx {
    public static void main(String[] args) {
        ArrayDeque<String>list = new ArrayDeque<>();
        list.add("Liam");
        list.add("Nataliia");
        list.add("Ira");
        list.add("Peter");
        list.add("John");
        list.add("Liam");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
    }

