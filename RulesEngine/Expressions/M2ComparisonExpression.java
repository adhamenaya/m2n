package RulesEngine.Expressions;

import jdk.incubator.vector.VectorOperators;

import java.util.Map;

public class M2ComparisonExpression implements IM2Expression {
    private IM2Expression left;
    private IM2Expression right;
    private String operator;

    public M2ComparisonExpression(IM2Expression left, IM2Expression right, String operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public boolean interpret(Map<String, String> context) {
        return left.interpret(context) && right.interpret(context);
    }

    @Override
    public Object getValue(Map<String, String> context) {
        return interpret(context);
    }
}