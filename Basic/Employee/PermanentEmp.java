package Java.Basic.Employee;
import java.util.Date;

public class PermanentEmp extends Employee {
    
    private double basicSal;
    private double pf;
    private double hra;
    private double da;
    private int permanentEmpCount = 0;
    {
        permanentEmpCount++;
    }

    public PermanentEmp(String firstName, String lastName, String grade, Date join, String empType, double basicSal, double pf, double hra, double da) {
        super(firstName, lastName, grade, join, empType);
        this.basicSal= basicSal;
        this.pf = pf;
        this.hra = hra;
        this.da= da;
    }

    public int getEmpCount() {
        return this.permanentEmpCount;
    }

    public double getSalary() {
        return this.basicSal + this.pf + this.hra + this.da;
    }

    
    public void display(Employee emp) {
        super.display(emp);
        System.out.println("Salary: " + this.getSalary());
        System.out.println("-----------xxx-----------");
    }
    
}
