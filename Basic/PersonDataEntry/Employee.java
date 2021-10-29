package Java.Basic.PersonDataEntry;

public class Employee extends Person {
    
    int empId;
    String designation;
    float experience;

    public Employee(String firstName, String lastName, String address, int empId, String designation, float experience) {
        super(firstName, lastName, address);
        this.empId = empId;
        this.designation = designation;
        this.experience = experience;
    }

    void printDetails() {
        System.out.println();
        super.printDetails();
        System.out.println("Employee ID: " + this.empId);
        System.out.println("Designation: " + this.designation);
        System.out.println("Experience: " + this.experience);
    }

    // Not executed...Superclass prevents overriding with static keyword
    static void print() {
        System.out.println("Can't override since Superclass has static method");
    }
}