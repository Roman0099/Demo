package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
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
