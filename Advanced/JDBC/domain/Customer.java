package JDBC.domain;

public class Customer {
    private int custId;
    private String custName;
    private String address;

    /* Using Default Non-parameterized Constructor
    public Customer(int custId, String custName, String address) {
        this.custId = custId;
        this.custName = custName;
        this.address = address;
    }
    */

    public int getCustId() {
        return this.custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return this.custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
