package Java.Basic.SuperClass;

public class Super_Child {
    public static void main(String[] args) {
        new ChildTest();
    }

}

class SuperTest {
    {
        System.out.println("Super Instance Block 1");
    }

    {
        System.out.println("Super Instance Block 2");
    }
}

class ChildTest extends SuperTest {
    {
        System.out.println("Child Instance Block 1");
    }

    {
        System.out.println("Child Instance Block 2");
    }
}
