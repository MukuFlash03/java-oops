package Java.Advanced.Collections.Sets;

import java.util.*;

public class SetEx1 {
    public static void main(String[] args) {
        
        HashSet <String> s1 = new HashSet <String>();

        s1.add("A1");
        s1.add("A2");
        s1.add("B1");
        s1.add("B2");
        s1.add("C1");
        s1.add("C2");
        boolean f1 = s1.add("F");
        boolean f2 = s1.add("F");

        System.out.println(f1 + "\t" + f2);

        /*
        TreeSet <String> s2 = new TreeSet <String>();
        s2.add("A1");
        s2.add("B1");
        s2.add("C1");
        s2.add("A2");
        s2.add("C2");
        s2.add("B2");
        */

        LinkedHashSet <String> s3 = new LinkedHashSet <String>();
        s3.add("A1");
        s3.add("B1");
        s3.add("C1");
        s3.add("A2");
        s3.add("C2");
        s3.add("B2");

        System.out.println("HashSet: " + s1);
        System.out.println();
        // System.out.println("TreeSet: " + s2);
        System.out.println();
        System.out.println("LinkedHashSet: " + s3);
    }
}
