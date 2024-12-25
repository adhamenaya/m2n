package RulesEngine.Expressions;

import java.util.Map;

public class M2ConstantExpression implements IM2Expression {
    private String value;

    public M2ConstantExpression(String value) {
        this.value = value;
    }

    @Override
    public boolean interpret(Map<String, String> context) {
        String contextValue = context.get(value);
        if (contextValue != null) {
            return contextValue.equals(value);
        }
        return false;
    }

    @Override
    public Object getValue(Map<String, String> context) {
        return value;
    }
}
