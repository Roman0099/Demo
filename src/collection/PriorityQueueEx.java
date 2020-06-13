package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<String>list = new PriorityQueue<>();
        list.add("Liam");
        list.add("Nataliia");
        list.add("Ira");
        list.add("Peter");
        list.add("John");
        list.add("Liam");
        System.out.println("head: " + list.element());
        System.out.println("head: " + list.peek());
        System.out.println("iterating the list elements");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
    }
        list.remove();
        list.poll();
        System.out.println("removing two elements:");
        Iterator itr1 = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
