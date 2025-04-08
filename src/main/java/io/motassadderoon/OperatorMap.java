package io.motassadderoon;

import java.util.HashMap;
import java.util.Map;

public class OperatorMap {
    private final Map<String, Operator> mapStringOperator;

    public OperatorMap() {
        this.mapStringOperator = new HashMap<>();
        addOperator(new PlusOperator());
        addOperator(new MinusOperator());
    }

    public Map<String, Operator> getMapStringOperator() {
        return mapStringOperator;
    }

    public void addOperator(Operator operator) {
        mapStringOperator.put(operator.getOperatorSymbol(), operator);
    }
}
