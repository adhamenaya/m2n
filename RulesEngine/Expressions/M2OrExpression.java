package RulesEngine.Expressions;

import java.util.Map;

public class M2OrExpression implements IM2Expression {
    private IM2Expression left;
    private IM2Expression right;

    public M2OrExpression(IM2Expression left, IM2Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(Map<String, String> context) {
        return left.interpret(context) || right.interpret(context);
    }

    @Override
    public Object getValue(Map<String, String> context) {
        return interpret(context);
    }
}