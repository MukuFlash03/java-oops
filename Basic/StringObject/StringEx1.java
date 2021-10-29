package Java.Basic.StringObject;

public class StringEx1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        s1.concat(" There"); // String immutable
        System.out.println(s1.concat(" There"));   // String immutable but printed
        s1 = s1.concat(" There");
        s2 += " There";
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1==s2);
        System.out.println(s1==s3);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1.indexOf('G'));

    }
}
