package Java.Advanced.Collections.Lists;

import java.util.*;

public class Array_LinkedListEx {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<String>();
        
        long t1=System.currentTimeMillis();
        for(int i=1;i<=100000;i++) {
            list1.add(0,"Apple");
        }
        long t2=System.currentTimeMillis();	
        System.out.println("Time took to add in Array "+(t2-t1));
        
        LinkedList<String> list2=new LinkedList<String>();
    
        long t3=System.currentTimeMillis();
        for(int i=1;i<=100000;i++) {
            list2.add(0,"Apple");
        }
        long t4=System.currentTimeMillis();	
        System.out.println("Time took to add in Array "+(t4-t3));
        
    }
}
