package Java.Advanced.LambdaExpr;

public class LambdaEx1 {
    
    public static void main(String[] args) {
        
        // Implementation 1 w/o lambda expr and using interface function implememntation
        Greeting greet1 = new Greeting() {
            public String wish(String name) {
                return "Hey there, " + name;
            }
        };
        greetingService(greet1, "Mukul");

        // Implementation 2 using lambda expr and creating Interface object
        Greeting greet2 = name -> "Hey there, " + name;
        greetingService(greet2, "Barry Allen");

        // Implementation 3 w/o creating Interface object
        greetingService(name -> "Hey there, " + name, "Ronaldo");
    }

    static void greetingService(Greeting greet, String name) {
        System.out.println(greet.wish(name));
    }
}

interface Greeting {
    String wish(String name);
}
