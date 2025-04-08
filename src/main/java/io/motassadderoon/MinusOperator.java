package io.motassadderoon;

public class MinusOperator extends Operator{
    public MinusOperator() {
        super("-");
    }

    @Override
    public int evaluate(int leftOperand, int rightOperand) {
        return leftOperand-rightOperand;
    }
}
