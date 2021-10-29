package Java.Basic.Loan_Mgmt;

public class Portfolio {
    public static void main(String[] args) {
        
        // Loan Objects
        Loan iciciCarLoan = new CarLoan("ICICI Car Loan", 123, 15, 1000000, "Volkswagen", "EV Cerulean", "MH 12 XY 0101");
        Loan iciciHomeLoan = new HomeLoan("ICICI Home Loan", 456, 15, 80, "Pune, Maharastra");
        Loan hdfcEducationLoan = new EducationLoan("HDFC Education Loan", 789, 7, 50, "Computer Science");
        Loan sbiLoan = new Loan("Sbi Basic Loan", 999, 5, 100000);

        Loan mukulLoans[] = {iciciCarLoan, iciciHomeLoan, hdfcEducationLoan, sbiLoan};

        Customer mukul = new Customer(469, "Mukul C. Mahadik");
        mukul.setLoans(mukulLoans);

        displayPortfolio(mukul);
    }

    public static void displayPortfolio(Customer cust) {
        
        float totalLoanAmt = cust.getTotalLoanAmt();
        int loanCount = cust.getLoanCount();
        Loan loans[] = cust.getLoans();

        System.out.println("\nHello " + cust.getCustId()+ " (ID: " + cust.getCustName() + ")");
        System.out.println("You have " + loanCount + " items in your cart.\n");

        
        for (Loan loan: loans) {
            loan.display();
        }

        System.out.println("\nYour total loan amount = ₹" + totalLoanAmt+ '\n');
    }
}
