package Java.Basic.Inheritance;
/*
Parent-Child class vs object inheritance nuances
 Class typecasting required to access child method
 If same method name not present in parent class
*/

public class Parent {
    public static void main(String[] args) {
        Parent p = new Child();
        p.f1();
        /* a.f2(); 
         Compilation error since f2() must also exist in parent class
         Since variable class type is "test" even though object is child class "sub"
         Compiler checks L to R and if class "a" contains f2 is checked first */

         // Child c = p; // Error type casting needed
         Child c = (Child)p;
         c.f2();
    }

    void f1() {

    }
}

class Child extends Parent {
    void f1() {
        
    }
    
    void f2() {

    }
}
