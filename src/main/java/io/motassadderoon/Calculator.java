package io.motassadderoon;

public class Calculator {
    private final String expression;
    private final OperatorMap operatorMap;

    public Calculator(String expression) {
        this.expression = expression;
        operatorMap=new OperatorMap();
    }

    public int evaluate() {
        String[] tokens = expression.split(" ");
        int result = Integer.parseInt(tokens[0]);
        for (int i = 1; i < tokens.length; i += 2) {
            String operatorString = tokens[i];
            Operator operator=operatorMap.getMapStringOperator().get(operatorString);
            int operand = Integer.parseInt(tokens[i + 1]);
            result=operator.evaluate(result,operand);
        }
        return result;
    }
}
