package review;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("b");
        arrayDeque.add("v");
        arrayDeque.add("c");
        arrayDeque.add("l");
       // arrayDeque.add(null);
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.peekLast());
        System.out.println(arrayDeque.removeFirst());
        System.out.println(arrayDeque.pop());
    }
}
