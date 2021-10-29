package Java.Basic.ExceptionHandling;

public class ExceptionEx1 {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println("Welcome");

        try {
            int result = a / (b*2 - a);
            System.out.println("Result = " + result);
        }

        catch(Exception e) {
            System.out.println("Divide by Zero");
        }

        /* Unreachable error...All handled by first exception 
        catch(ArithmeticException e) {
            System.out.println("Divide by Zero");
        }`
        */        

        System.out.println("Application ends");
    }
}
