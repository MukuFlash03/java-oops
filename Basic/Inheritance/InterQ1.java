package Java.Basic.Inheritance;

public class InterQ1 {
    public static void main(String[] args) {
        Hello h = new Hello1();
        h.sayHello();
    }
}

interface Hello {
    void sayHello();
}

class Hello1 implements Hello {
    
    //Interface methods are public abstaact by default
    // Hence visibility will be reduced if only void is used
    // Need to specify public
    // void sayHello() {
    public void sayHello() {
        System.out.println("Hello GM");
    }
}

