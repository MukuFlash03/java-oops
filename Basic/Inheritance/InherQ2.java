package Java.Basic.Inheritance;

public class InherQ2 {
    public static void main(String[] args) {
        TestA test = new TestB();
        System.out.println(test.x);
    }
}

class TestA {
    int x = getX();
    int y = 5;

    int getX() {
        System.out.println("Test A");
        return y+5;
    }
}

class TestB extends TestA {
    int getX() {
        System.out.println("Test B");
        return y*5;
    }
}


// All object  values are assigned default values via default constructor
// Hence, x=0, y=0;