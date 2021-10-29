package Java.Advanced.LambdaExpr;

public class LambdaEx2 {
    
    public static void main(String[] args) {

        Calculator add = (a,b) -> a+b;
        calculatorService(add, 69, 23);
        Calculator subtract = (a,b) -> a-b;
        calculatorService(subtract, 69, 23);
        Calculator multiply = (a,b) -> a*b;
        calculatorService(multiply, 69, 23);
        Calculator divide = (a,b) -> a/b;
        calculatorService(divide, 69, 23);
    }

    static void calculatorService(Calculator calc, float a, float b) {
        System.out.println(calc.eval(a,b));
    }
}

// Functional Interface has only one implementable method
interface Calculator {
    float eval(float f1, float f2);
}