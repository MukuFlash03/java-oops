package Java.Basic.ExceptionHandling;

public class NestedTry {
    public static void main(String[] args) {
        try {
            System.out.println("Try 1");
            int arr[] = {1,2,3,4,5};
            System.out.println(arr[4]);

            // Inner try exceptions can be handled by outer try
            // Since inner try is a part of outer try
            // If exception in inner try
            // Control goes to inner catch if present
            // Else control goes to outer catch if available
            // Else program terminates
            try {
                System.out.println("Try 2");
                int a =10;
                System.out.println(a/0);
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Catch 1");
            }
            System.out.println("Try 2 ends");
        }
        catch(ArithmeticException e) {
            System.out.println("Catch 2");
        }

        /*
        // If this catch block not present, exception not handled
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch 1");
        }
        */

        System.out.println("Try 1 ends");
        System.out.println("Main ends");
    }
}
