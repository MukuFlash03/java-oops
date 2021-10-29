package Java.Basic.TransferAccount;
public class Account {
    int accNo;
    String accountHolderName;
    float bankBalance;

    public Account(int accNo, String accountHolderName, float bankBalance) {
        this.accNo = accNo;
        this.accountHolderName = accountHolderName;
        this.bankBalance = bankBalance;
    }

    void fundTransfer(Account beneficiaryAccount, float amt) {
        if (bankBalance < amt)
            System.out.println("Insufficient Bank Balance!");
        else {    
            beneficiaryAccount.bankBalance += amt;
            bankBalance -= amt;
            System.out.println("Transfer Successful");
            System.out.println(bankBalance);
            System.out.println(beneficiaryAccount.bankBalance);
        }
    }
}
