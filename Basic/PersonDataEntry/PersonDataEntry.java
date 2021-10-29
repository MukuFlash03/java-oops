package Java.Basic.PersonDataEntry;

public class PersonDataEntry {

    static {
        System.out.println("Welcome to Data Entry System");
    }
    public static void main(String[] args) {
        
        /*  //Traditional method
        Employee e1 = new Employee("ABC", "XYZ", "Alpha", 123, "Manager", 4.5f);
        Student s1 = new Student("Mukul", "M", "Beta", 469, "Java", "A");
        e1.printDetails();
        s1.printDetails();
        */

        // Objects stored in super class type array
        Person e1 = new Employee("ABC", "XYZ", "Alpha", 123, "Manager", 4.5f);
        Person s1 = new Student("Mukul", "M", "Beta", 469, "Java", "A");
        Person people[] = {e1,s1};

        // Shorthand For each loop
        for (Person person: people) {
            person.printDetails();
        }

        // Person p1 = new Person("XYZ", "DEF", "Gamma");
        // p1.print(); // Can't access static method by object/overriding not allowed
        // e1.print(); // Can't access static method by object/overriding not allowed
        Person.print(); // Can access static method by className
        Employee.print(); // Can access static method by className
    }
}