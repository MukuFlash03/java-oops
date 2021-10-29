package JDBC;

import java.util.*;

import JDBC.domain.Customer;

public class Main {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int custId;
        String custName, address;

        System.out.println("Operation Menu: ");
        System.out.println("1. Add Customer Data");
        System.out.println("2. Read all Customer Data");
        System.out.println("3. Fetch Customer by ID");
        System.out.println("4. Update Customer Address");
        System.out.println("5. Fetch Customer by Address");
        System.out.println("Enter choice: ");
        int ch1 = scn.nextInt();
        scn.nextLine();

        switch (ch1) {
            case 1: 
                System.out.println("Welcome to Customer Data Entry: ");
                System.out.println("Enter Customer Details: ");
                System.out.println("Enter Customer ID: ");
                custId = scn.nextInt();
                scn.nextLine();
                System.out.println("Enter Customer Name: ");
                custName = scn.nextLine();
                System.out.println("Enter Customer Address: ");
                address = scn.nextLine();
                addData(custId, custName, address);
                break;

            case 2: 
                readData();
                break;

            case 3: 
                System.out.println("Enter Customer ID: ");
                custId = scn.nextInt();
                scn.nextLine();
                readById(custId);
                break;
            
            case 4:
                System.out.println("Enter Customer ID: ");
                custId = scn.nextInt();
                scn.nextLine();
                System.out.println("Enter New Address: ");
                address = scn.nextLine();
                updateAddr(custId, address);
                break;

            case 5: 
                System.out.println("Enter Address: ");
                address = scn.nextLine();
                readByAddr(address);
                break;
            default:
                System.out.println("Invalid Choice.");
        }
    }

    public static void addData(int custId, String custName, String address) {
        Customer c1 = new Customer();
        c1.setCustId(custId);
        c1.setCustName(custName);
        c1.setAddress(address);
        
        CustomerDAO cdao = new CustomerDAO();
        int count = cdao.addCustomer(c1);
        System.out.println(count + " No. of Rows affected.");
    }

    public static void readData() {

        CustomerDAO cdao = new CustomerDAO();
        List <Customer> custList = cdao.readAllCustomers();

        for (Customer c : custList) {
            System.out.println(c.getCustId() + "\t" + c.getCustName() + "\t" + c.getAddress());
        }

        System.out.println();
    }


    // Read specific custId data
    public static void readById(int custId) {
        
        CustomerDAO cdao = new CustomerDAO();
        Customer cust = cdao.findCustomerById(custId);

        if (isNullData(cust))
            System.out.println ("No Customer found with matching CustID.");
        else
            System.out.println(cust.getCustId() + "\t" + cust.getCustName() + "\t" + cust.getAddress());

    }
    
    public static void updateAddr(int custId, String newAddress) {
        CustomerDAO cdao = new CustomerDAO();
        int count = cdao.updateAddress(custId, newAddress);
        System.out.println(count + " No. of Rows affected.");
    }

    public static void readByAddr(String address) {
        
        CustomerDAO cdao = new CustomerDAO();
        List <Customer> custList = cdao.searchByAddress(address);

        if (custList.isEmpty())
            System.out.println("No Matching Customers found.");
        else {
            for (Customer c : custList) {
                System.out.println(c.getCustId() + "\t" + c.getCustName() + "\t" + c.getAddress());
            }
        }

    }

    public static boolean isNullData(Customer c) {
        if (c.getCustId() == 0 && c.getCustName() == null && c.getAddress() == null)
            return true;
        return false;
    }

}
