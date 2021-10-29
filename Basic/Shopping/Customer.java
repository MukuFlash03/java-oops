package Java.Basic.Shopping;

public class Customer {
    private int custId;
    private String custName;
    private Cart custCart;

    public Customer(int custId, String custName) {
        this.custId = custId;
        this.custName = custName;
    }

    public void setCart(Cart custCart) {
        this.custCart = custCart;
    }

    public Cart getCustCart() {
        return this.custCart;
    }
    
    public int getCustId() {
        return this.custId;
    }

    public String getCustName() {
        return this.custName;
    }

    
}
