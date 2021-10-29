package Java.Basic.com.oracle;

public class Customer_Data {
    static int a = 3;
    public static void main(String[] args) {

        Customer_Data c = new Customer_Data();
        Customer c1 = new Customer();
        Customer c2 = new Customer();

        Customer.setType("Human");

        c1.setId(123);
        c1.setName("ABC");
        
        c2.setId(321);
        c2.setName("XYZ");

        c1.display(c1);
        c2.display(c2);

        System.out.println(a);
        welcome();
        c.sessionId();
    }
    
    static void welcome() {
        System.out.println("Hello there, welcome to data entry!");
    }

    void sessionId() {
        System.out.println("Session Id: " + (int)(10000*Math.random()));
    }
}
