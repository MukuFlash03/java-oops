package Java.Basic.Inheritance;


public class InterfaceEx {
    public static void main(String[] args) {
        driver(new Nexon());
        System.out.println("**********");
        driver(new Audi());
    }
    
    static void driver(Drive d) {
        d.gear(); 
    }
    
}    
    
interface Drive{
    int MAX_SPEED=150; //public static final int MAX_SPEED=150;
    void gear(); //public abstract void gear();
}
    
class Nexon implements Drive{

    public void gear() {
        //MAX_SPEED++;
        System.out.println("Nexon car geat activated ....");
        System.out.println("Max Speed is "+MAX_SPEED);
    }
}

class Audi implements Drive{

    public void gear() {
        System.out.println("Audi car geat activated ....");
    }
    
}