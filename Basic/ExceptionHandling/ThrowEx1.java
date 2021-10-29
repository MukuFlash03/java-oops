package Java.Basic.ExceptionHandling;

import java.util.*;

public class ThrowEx1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to ICICI Bank ATM");
        float bankBalance = 10000;
        System.out.println("Enter withdrawal amount: ");
        float debitAmt = scn.nextFloat();

        try {
            withdraw(bankBalance, debitAmt);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void withdraw(float bankBalance, float debitAmt) throws InsufficientFundsException {
        if(bankBalance < debitAmt) {
            // Throw Exception
            throw new InsufficientFundsException("Transaction Failed: Insufficient Funds");
        }
        else {
            bankBalance -= debitAmt;
            System.out.println("Transaction Successful");
            System.out.println("Balance: " + bankBalance);
        }
    }
}
