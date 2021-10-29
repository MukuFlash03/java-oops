package Java.Basic.StringObject;

public class ToStringEx {
    public static void main(String[] args) {
        Person p=new Person("Abhay","Kumar","Bihar");
        
        //if any object references is printed implicity it invokes toString()
        System.out.println(p);
        
        System.out.println(p.toString());
    }
}
    
class Person extends Object{

    private String firstName;
    private String lastName;
    private String address;


    public Person(String firstName, String lastName, String address) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }


    public String toString() {
        return "First Name :"+ firstName+" last name : "+lastName+" Address : "+address;
    }

}
