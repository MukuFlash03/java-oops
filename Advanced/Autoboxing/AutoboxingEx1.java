package Java.Advanced.Autoboxing;

public class AutoboxingEx1 {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        System.out.println(i1);

        Integer i2 = 100; // Autoboxing
        System.out.println(i2); 

        int i3 = i2; // Auto unboxing
        System.out.println(i3);

        Object obj1 = new Integer(99);
        System.out.println(obj1);

        Object obj2 = 99;
        System.out.println(obj2);
    }
}
