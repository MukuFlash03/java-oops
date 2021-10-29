
package Java.Basic.Inheritance;
public class Constr {
    public static void main(String[] args) {
        new Derive();
    }
}

class Base {
    public Base() {
        System.out.println("Base");
    }
}


class Derive extends Base {
    public Derive() {
        super();
        System.out.println("Derive");
    }
}