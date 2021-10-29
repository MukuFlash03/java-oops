package Java.Basic.ExceptionHandling;
import java.sql.SQLException;

public class ThrowsExcTrace {

    public static void main(String[] args) {
        System.out.println("Main method");
        try {
            myMethod();
        } catch (SQLException e) {
            System.out.println("Exception occured ...."+e.getMessage());
            e.printStackTrace();
        }
    }

    static void myMethod()  throws SQLException{
        System.out.println("my method");
        yourMethod();
    }


    static void yourMethod()  throws SQLException{
        //there may be a chance of getting SQLException .. but i m not going to handle instead i ll ask the caller to handle
        System.out.println("your method");
        throw new SQLException("sql exception test ....");
    }
}