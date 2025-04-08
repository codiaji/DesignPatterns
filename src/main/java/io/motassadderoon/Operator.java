package io.motassadderoon;

public abstract class Operator {
    private final String operatorSymbol;

    public Operator(String operatorSymbol) {
        this.operatorSymbol = operatorSymbol;
    }

    public String getOperatorSymbol() {
        return operatorSymbol;
    }

    public abstract int evaluate(int leftOperand, int rightOperand);
}
