package Java.Basic.Loan_Mgmt;

public class Customer {
    private int custId;
    private String custName;
    private Loan myLoans[];
    private float totalLoanAmt;

    public Customer(int custId, String custName) {
        this.custId = custId;
        this.custName = custName;
    }

    public int getCustId() {
        return this.custId;
    }

    public String getCustName() {
        return this.custName;
    }

    public void setLoans(Loan loanArr[]) {
        this.myLoans = loanArr;
        calcTotalLoanAmt();
    }

    public Loan[] getLoans() {
        return this.myLoans;
    }

    public int getLoanCount() {
        return this.myLoans.length;
    }

    public void calcTotalLoanAmt() {
        for (Loan loan: this.myLoans) {
            this.totalLoanAmt+= loan.getLoanAmount();
        }
    }

    public float getTotalLoanAmt() {
        return this.totalLoanAmt;
    }
    
}