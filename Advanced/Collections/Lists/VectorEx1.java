package Java.Advanced.Collections.Lists;

import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {
        
        Vector<String> v1 = new Vector<String>();
        System.out.println("Initial Capacity: " + v1.capacity());

        Vector<String> v2 = new Vector<String>(3);
        System.out.println("Initial Capacity: " + v2.capacity());

        v2.add("Pune");
        v2.add(1, "Mumbai");
        v2.add("Bangalore");
        System.out.println(v2);
        System.out.println(v2.size());
        System.out.println("Updated Capacity: " + v2.capacity());

        v2.add("Pune");
        v2.add("Mumbai");
        v2.add("Bangalore");

        v2.add("Pune");
        v2.add("Mumbai");
        v2.add("Bangalore");

        System.out.println(v2.size());
        System.out.println("Updated Capacity: " + v2.capacity());

        String city = v2.get(0);
        System.out.println(city);

        for (String str: v2) {
            System.out.println(str);
        }

    }
}