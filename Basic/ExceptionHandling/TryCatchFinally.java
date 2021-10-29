package Java.Basic.ExceptionHandling;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("I'm Try");
            System.out.println(5/0);
            System.out.println("End Try");
        }

        finally {
            System.out.println("I'm Finally");
        }
        System.out.println("Main ends");
    }
}
