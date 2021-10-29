/*
package Java.Basic.ExceptionHandling;
import java.sql.SQLException;

public class InherException {
    public static void main(String[] args) {
        Super s = new Derive();
        s.f1();
    }
}

class Super {
    void f1() throws SQLException {

    }
}

class Derive extends Super {
    void f1() {

    }
}
*/


/*
// Compilation no error
// Runtime error...ambiguity
class Super {
    void f1() {

    }
}


class Derive extends Super {
    void f1() throws SQLException {

    }
}
*/


/*
// Works fine since super class can throw checked exception
// Base class can throw runtime exception which is unchecked
// Compiler doesn't force to handle runtime exception
class Super {
    void f1() throws SQLException {

    }
}

class Derive extends Super {
    void f1() throws ArithmeticException{

    }
}
*/

/*
// Error since can't throw more than one checked exception
// Must use try-catch to handle checked exception
// f1() overriding ambiguity occurs
// Compilation looks at SQLExc
// Runtime looks at IOExc
class Super {
    void f1() throws SQLException {

    }
}

class Derive extends Super {
    void f1() throws IOException{

    }
}
*/