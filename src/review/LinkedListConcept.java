package review;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
    public static void main(String[] args) {
        LinkedList<String>list = new LinkedList<>();
        //add
        list.add("test");
        list.add("Qtp");
        list.add("selenium");
         //print
        System.out.println(list);

        //add first
        list.addFirst("Roman");
        list.addLast("Automation");
        System.out.println(list);

        //get
        System.out.println(list.get(0));
        //set
        list.set(0,"Liam");
        System.out.println(list.get(0));

        //remove first and last element
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        //remove
        list.remove(1);
        System.out.println(list);


        //how to iterate in linkedLink
        //for loop
        //while loop
        //iterator
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        for(String str: list){
            System.out.println(str);
        }
          //iterator
       Iterator<String>itr =  list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //while loop

        int num = 0;
        while(list.size()>num){
            System.out.println(list.get(num));
            num++;
        }
    }
}
