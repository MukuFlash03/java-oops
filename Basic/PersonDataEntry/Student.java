package Java.Basic.PersonDataEntry;

public class Student extends Person {
    
    int studId;
    String course;
    String grade;

    public Student(String firstName, String lastName, String address, int studId, String course, String grade) {
        super(firstName, lastName, address);
        this.studId = studId;
        this.course = course;
        this.grade = grade;
    }

    void printDetails() {
        System.out.println();
        super.printDetails();
        System.out.println("Student ID: " + this.studId);
        System.out.println("Course: " + this.course);
        System.out.println("Grade: " + this.grade);
    }
}
