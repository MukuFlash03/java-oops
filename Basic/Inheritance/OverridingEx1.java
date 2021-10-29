package Java.Basic.Inheritance;

public class OverridingEx1 {
    public static void main(String[] args) {
        Parent1 p = new Child1();
        p.f1(); // Accesses static f1(), else overriden by child f1()

        // Parent1.f1(); // Accesses static f1() with classname
        
        Child1 c = (Child1)p;
        // Child1.f1(); // Accesses static f1() with classname
        c.f1(); // Accesses child static f1() since typecasting used
        c.f2();

        // Child1 x = p; 
        // Even though p is a Child object
        // Compiler checks L to R and sees that
        // It is of type Parent
        // Child1 x = (Child1)p;   // Typecasting makes it valid

        p = new Child2(); // Animal class of p can contain child object
        
        // Child1 c2 = (Child1)p;
        // Compilation is successful since Parent Classtype Parent1 is typecasted to Child ClassType Child1
        // Runtime error since p is a Child2 object and cannot be of classType Child1

        // Child2 c3 = new Child2();
        
        // Child1 c4 = (Child1)c3;
        // Compilation error since c3 classType is Child2
        // Which is sibling of c4 classType Child1

    }
    
}


class Parent1 {
    void f1() {
        System.out.println("Parent f1");
    }
}

class Child1 extends Parent1 {
    void f1() {
        System.out.println("Child1 f1");
    }
    
    void f2() {
        System.out.println("Child1 f2");
    }
}

class Child2 extends Parent1 {
    void f1() {
        System.out.println("Child2 f1");
    }
    
    void f2() {
        System.out.println("Child2 f2");
    }
}
