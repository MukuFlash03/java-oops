package Java.Basic.Employee;
import java.util.Date;

public class Employee {
    
    private String firstName;
    private String lastName;
    private String grade;
    private Date join;
    private String empType;

    private static int totalEmpCount = 0;
    private int empId = 0;

    {
        totalEmpCount++;
        this.empId = totalEmpCount;
    }

    public Employee() {
        this.firstName = "NA";
        this.lastName = "NA";
        this.grade = "NA";
        this.empType = "NA";
    }

    public Employee(String firstName, String lastName, String grade, Date join, String empType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.join = join;
        this.empType = empType;
    }

    public void setDate(Date doj) {
        this.join = doj;
    }

    public static int getCount() {
        return totalEmpCount;
    }

    public void display(Employee emp) {
        System.out.println("Employee ID: " + this.empId);
        System.out.println("Name: " + this.firstName + ' ' + this.lastName);
        System.out.println("Grade: " + this.grade);
        System.out.println("Type: " + this.empType);
        System.out.println("Joining Date: " + this.join);

        /*
        if (emp instanceof PermanentEmp) {
            PermanentEmp pEmp = (PermanentEmp)emp;
            pEmp.display(pEmp);
        }
        if (emp instanceof ContractEmp) {
            ContractEmp cEmp = (ContractEmp)emp;
            cEmp.display(cEmp);
        }
        */
    }

}


