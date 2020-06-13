package review;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {
    public static void main(String[] args) {
        //it is similar to hashmap but it is synchronized
        //stores value in key and value
        //key -->object-->hashcode-->value

        Hashtable hs = new Hashtable();
        hs.put(1,"Tom");
        hs.put(2, "Fred");
        hs.put(3, "Greg");
         //create a clone copy/shallow copy:

        Hashtable h = new Hashtable();
        h = (Hashtable)hs.clone();
        System.out.println("The values from hs: " + hs);
        System.out.println("The values from h: " + h);

        hs.clear();
        System.out.println("The values from hs: " + hs);
        System.out.println("The values from h: " + h);

        //contains method
        Hashtable st = new Hashtable();
        st.put("A", "Roman");
        st.put("B", "Java");
        st.put("C", "Selenium");
        if(st.containsValue("Ray")) {
            System.out.println("value is found");
        }else{
            System.out.println("value not found");

            //print all values using enumeration elements
            Enumeration e = st.elements();
            System.out.println("print value from st");
            while(e.hasMoreElements()) {
                System.out.println(e.nextElement());
            }


                //get all the values from hashtable using entrySet() --set of hashtable values:
                System.out.println("print using entrySet");
                Set s = st.entrySet();
                System.out.println(s);


                Hashtable hs2 = new Hashtable();
                hs2.put(1,"Tom");
                hs2.put(2, "Fred");
                hs2.put(3, "Greg");

                //check both hashtables are equal or not
                if(hs.equals(hs2))
                    System.out.println("both are equal");
                }
            }


        }





