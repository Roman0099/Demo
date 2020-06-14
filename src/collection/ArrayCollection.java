package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Liam");
        list.add("Nataliia");
        list.add("Ira");
        list.add("Peter");
        list.add("John");
        list.add("Bruce");
        list.add("Fred");
        list.add("Alina");
        list.remove("John");
        list.remove("Peter");
        list.remove("Alina");
        list.size();
        //Traversing list through iterator
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
