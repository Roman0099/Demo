package review;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListReview {
    public static <E> void main(String[] args) {
        //can contain duplicate values
        //maintain insertion order
        //it is not synchronized.
        //allows random access to value. you can fetch values by indexes.
        ArrayList list = new ArrayList();
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add("Great");
        list.add("Day");
        System.out.println(list.size());


        //to print out all the values we use for loop.
        //also using iterator
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

            //non generic vs generic. None generic is when we dont define data type. Generic is when we define data type
        }

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(24);
        list1.add(35);
        list1.add(45);
        System.out.println(list1.size());
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));

        }


        ArrayList<E> list2 = new ArrayList<E>();

        //Employee object
        Employee emp1 = new Employee("Liam", 2, "computer");
        Employee emp2 = new Employee("Tom", 5, "computer");
        Employee emp3 = new Employee("Pete", 7, "computer");
        //create arrayList

        ArrayList<Employee> list3 = new ArrayList<Employee>();
        list3.add(emp1);
        list3.add(emp2);
        list3.add(emp3);
        Iterator<Employee> itr = list3.iterator();
        while (itr.hasNext()) {
            Employee emp = itr.next();
            System.out.println(emp.name);
            System.out.println(emp.age);
            System.out.println(emp.department);

        }


        //AddAll
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("test");
        arr1.add("selenium");
        arr1.add("QTP");

        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("dev");
        arr2.add("java script");
        arr2.add("java");

        arr1.addAll(arr2);
        for (int i = 0; i < arr1.size(); i++) {
            System.out.println(arr1.get(i));
        }

        //remove all

        arr1.removeAll(arr2);
        for (int i = 0; i < arr1.size(); i++) {
            System.out.println(arr1.get(i));

        }

        //retain all
        ArrayList<String> arr5 = new ArrayList<String>();
        arr5.add("test");
        arr5.add("selenium");
        arr5.add("QTP");
        arr5.add("java");

        ArrayList<String> arr6 = new ArrayList<String>();
        arr6.add("dev");
        arr6.add("java script");
        arr6.add("java");

        arr5.retainAll(arr6);

        for (int i = 0; i < arr5.size(); i++) {
            System.out.println(arr5.get(i));


        }


    }
}
