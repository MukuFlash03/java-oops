package Java.Basic.Inheritance;

public class InherQ1 {
    public static void main(String[] args) {
        new ChildQ();
        // Child object created hence functions called will refer to Child functions
        // Parent functions will be overriden 
        // Even if they are called in constructor they will execute Child functions.
        
    }
}

class ParentQ {
    public ParentQ() {
        f1();
    }

    private void f1() {
        System.out.println("Parent f1");
    }
}


class ChildQ extends ParentQ {
    void f1() {
        System.out.println("Child f1");
    }
}
