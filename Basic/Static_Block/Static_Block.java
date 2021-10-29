package Java.Basic.Static_Block;

public class Static_Block {

    public static void main(String[] args) {
        System.out.println("Main 1");

        // Static block of StaticTest class is executed first
        // Since first class is loaded then variable x is accessed
        System.out.println("x: " + StaticTest.x);

        /*
        new B();
        new A();
        new C();
        */
        System.out.println("Main 2");
    }

    static {    // Even if execution starts at main
                // Static block executes first since 
                // static memory allocated first during creation
                // Usecase: Compiler info, metadata required
        System.out.println("Static Main Class 1");
        premain();
    }
    

    static void premain() {
        System.out.println("I am premain() executed in static before main");
    }
}

class StaticTest {
    static {
        System.out.println("I am Fun");
    }
    static int x = 10;
}

class A {   
    {   // Outputted every time new instance created either by itself or child class
        System.out.println("Hello A");
    }

    static {    // Outputted before instance block of A and only once.
        // Since static loaded/created when Class created
        System.out.println("I am static A1");
    }

    static {    // Outputted before instance block of A and only once.
        // Since static loaded/created when Class created
        System.out.println("I am static A2");
    }
}

class B extends A {

    static {    // Outputted before instance block of A and only once.
        // Since static loaded/created when Class created
        System.out.println("I am static B");

    }

    {   // Parent class instance block outputted first
        System.out.println("I am B");
    }
}

class C extends A{
    {   // Parent class instance block outputted first
        System.out.println("I am C");
    }

    static {    // Outputted before instance block of A and only once.
        // Since static loaded/created when Class created
        System.out.println("I am static C");

    }
}