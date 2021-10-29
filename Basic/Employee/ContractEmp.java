package Java.Basic.Employee;
import java.util.Date;

public class ContractEmp extends Employee {

    private String contractor;
    private double dailyWage;
    private double days;

    private int contractEmpCount = 0;
    {
        contractEmpCount++;
    }

    public ContractEmp(String firstName, String lastName, String grade, Date join, String empType, String contractor, double dailyWage, double days) {
        super(firstName, lastName, grade, join, empType);
        this.contractor = contractor;
        this.dailyWage = dailyWage;
        this.days = days;
    }
    
    public int getEmpCount() {
        return this.contractEmpCount;
    }

    public double getSalary() {
        return this.dailyWage * this.days;
    }

    public String getContractor() {
        return this.contractor;
    }

    
    public void display(Employee emp) {
        super.display(emp);
        System.out.println("Salary: " + this.getSalary());
        System.out.println("Contractor: " + this.getContractor());
        System.out.println("-----------xxx-----------");
    }
    
}
