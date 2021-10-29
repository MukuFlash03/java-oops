package Java.Basic.Employee;
import java.util.Date;

public class Employee_Create {
    public static void main(String[] args) {
        Date sdoj = new Date(121, 7, 20);
        Date bdoj = new Date(121, 8, 5);
        Employee sam = new PermanentEmp("Sam", "ST", "L-1", sdoj, "Permanent", 55000, 12000, 13000, 5600);
        Employee ben = new ContractEmp("Ben", "XY", "L-3", bdoj, "Contract", "Oracle", 5500, 15);

        /*
        Employee a = new Employee();
        a = new Employee();
        */
    
        sam.display(sam);
        sam.setDate(bdoj);
        sam.display(sam);

        ben.display(ben);

        System.out.println("\nTotal Employees: " + Employee.getCount());
        System.out.println("Permanent Employees: " + PermanentEmp.getCount());
        System.out.println("Contract Employees: " + ContractEmp.getCount());
        System.out.println("-----------xxx-----------\n");
    }
}
