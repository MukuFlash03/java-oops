package Java.Basic.ExceptionHandling;

public class TCFReturn {
    public static void main(String[] args) {
        int x = f1();
        System.out.println(x);
    }

    static int f1() {
        try {
            System.out.println("Try");
            System.out.println(5/0);
            return 1;
        }
        catch(Exception e) {
            System.out.println("Catch");
            return 2; // Returned if exception caught and no return in finally
        }
        /*finally {
            // System.exit(1); 
            // No statements executed after control transferred back to main
            // Since system (JVM) is now shutdown due to exit()

            System.out.println("Finally");
            return 3; // Returned in any case unless exit() occurs
        }*/
    }

}
