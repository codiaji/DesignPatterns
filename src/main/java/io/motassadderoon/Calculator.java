package io.motassadderoon;

public class Calculator {
    private final String expression;

    public Calculator(String expression) {
        this.expression = expression;
    }

    public int evaluate() {
        String[] tokens = expression.split(" ");
        int result = Integer.parseInt(tokens[0]);
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            int operand = Integer.parseInt(tokens[i + 1]);
            if (operator.equals("+")) {
                result += operand;
            } else if (operator.equals("-")) {
                result -= operand;
            }
        }
        return result;
    }
}
