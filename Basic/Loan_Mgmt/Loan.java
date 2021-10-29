package Java.Basic.Loan_Mgmt;

public class Loan {
    private String loanName;
    private int loanId;
    private int loanTenure;
    private float loanAmt;

    public Loan(String loanName, int loanId, int loanTenure, float loanAmt) {
        this.loanName = loanName;
        this.loanId = loanId;
        this.loanTenure = loanTenure;
        this.loanAmt = loanAmt;
    }

    public float getLoanAmount() {
        return this.loanAmt;
    }

    public String getLoanName() {
        return this.loanName;
    }

    public int getLoanId() {
        return this.loanId;
    }

    public int getLoanTenure() {
        return this.loanTenure;
    }

    void display() {
        System.out.println(this.loanId+ " \t\t " + 
        this.loanName + " \t\t " + this.loanTenure + 
        " \t\t " + this.loanAmt);
    }
}

class CarLoan extends Loan {
    
    private String carMake;
    private String carModel;
    private String regNo;

    public CarLoan(String loanName, int loanId, int loanTenure, float loanAmt, String carMake, String carModel, String regNo) {
        super(loanName, loanId, loanTenure, loanAmt);
        this.carMake= carMake;
        this.carModel = carModel;
        this.regNo = regNo;
    }

    void display() {
        super.display();
        System.out.println(this.carMake + '\t' + this.carModel + '\t' + this.regNo);
    }
}

class HomeLoan extends Loan {
    
    private String address;

    public HomeLoan(String loanName, int loanId, int loanTenure, float loanAmt, String address) {
        super(loanName, loanId, loanTenure, loanAmt);
        this.address = address;
    }

    void printDetails() {
        super.display();
        System.out.println(this.address);
    }
}

class EducationLoan extends Loan {
    
    private String course;

    public EducationLoan(String loanName, int loanId, int loanTenure, float loanAmt, String course) {
        super(loanName, loanId, loanTenure, loanAmt);
        this.course = course;
    }

    void display() {
        super.display();
        System.out.println(this.course);
    }
}

