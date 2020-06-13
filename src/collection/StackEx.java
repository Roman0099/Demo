package collection;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> list = new Stack<>();
        list.push("Liam");
        list.push("Nataliia");
        list.push("Ira");
        list.push("Peter");
        list.push("John");
        list.push("Liam");
        list.pop();
        //Traversing list through iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());


        }
    }
}



