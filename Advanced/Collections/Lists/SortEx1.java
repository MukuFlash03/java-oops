package Java.Advanced.Collections.Lists;

import java.util.*;

public class SortEx1 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList <String>();
        list.add("A1");
        list.add("B1");
        list.add("C1");
        list.add("A2");
        list.add("C2");
        list.add("B2");
        
        System.out.println("Before Sorting: ");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After Sorting: ");
        System.out.println(list);
    }
}
