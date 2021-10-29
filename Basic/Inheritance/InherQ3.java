package Java.Basic.Inheritance;

public class InherQ3 {
    public static void main(String[] args) {
        ParentA p = new ChildA();

        // // Instance variable cannot be overriden
        System.out.println(p.x);

        // Method can be overridden
        p.printX();
    }
}

class ParentA {
    int x = 10;
    // Instance variable cannot be overriden

    // Method can be overridden
    void printX() {
        System.out.println("X: "+ x);
    }
}

class ChildA extends ParentA {
    int x = 20;
    // Instance variable cannot be overriden


    // Method can be overridden
    void printX() {
        System.out.println("X: "+ x);
    }
}
