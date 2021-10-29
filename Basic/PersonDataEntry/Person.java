package Java.Basic.PersonDataEntry;

public class Person {
    
    String firstName;
    String lastName;
    String address;

    public Person(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    void printDetails() {
        System.out.println("Name: " + this.firstName + " " + this.lastName);
        System.out.println("Address: " + this.address);
    }

    static void print() {
        System.out.println("Static method helps prevent superclass overriding");
    }
}