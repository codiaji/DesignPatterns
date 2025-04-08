package io.motassadderoon;

public class PlusOperator extends Operator {

    public PlusOperator() {
        super("+");
    }

    @Override
    public int evaluate(int leftOperand, int rightOperand) {
        return leftOperand+rightOperand;
    }
}
