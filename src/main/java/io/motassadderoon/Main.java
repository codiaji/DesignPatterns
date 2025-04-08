package io.motassadderoon;

public class Main {
    public static void main(String[] args) {
        String expression = "5 3 + 2 -"; // equivalent to (5 + 3) - 2
        Expression parsedExpression = Interpreter.parse(expression);
        int result = parsedExpression.interpret();
        System.out.println("Result: " + result);
    }
}
