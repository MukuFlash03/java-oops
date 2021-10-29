package Java.Basic.com.oracle;

public class Customer {
    private int custId;
    private String custName;
    private static String custType;

    /*
    // Constructor without access specifiers
    public Customer(int custId, String custName) {
        this.custId = custId;
        this.custName = custName;
    }
    */

    // Setter method
    public static void setType(String custType) {
        Customer.custType = custType;
    }

    // Setter method
    public void setId(int custId) {
        this.custId = custId;
    }

    // Getter method
    public int getId() {
        return custId;
    }

    // Setter method
    public void setName(String custName) {
        this.custName = custName;
    }

    // Getter method
    public String getName() {
        return custName;
    }

    public void display(Customer c) {
        System.out.println(c.getId() + " : " + c.getName() + " : " + Customer.custType);
    }
    
}
