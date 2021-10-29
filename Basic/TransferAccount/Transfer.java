package Java.Basic.TransferAccount;
public class Transfer {
    public static void main(String[] args) {
        Account a1 = new Account(1111, "ABC", 20000);
        Account a2 = new Account(2222, "XYZ", 10000);

        float amount = 2500f;

        a1.fundTransfer(a2, amount);

        /* A1 now refers to A2
        a1=a2;
        System.out.println(a1.accountHolderName);
        */
    }
}
