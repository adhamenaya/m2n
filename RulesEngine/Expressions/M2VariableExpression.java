package RulesEngine.Expressions;

import java.beans.Expression;
import java.util.Map;

public class M2VariableExpression implements IM2Expression{
    private String variableName;

    public M2VariableExpression(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public boolean interpret(Map<String, String> context) {
        return context.containsKey(variableName);
    }

    @Override
    public Object getValue(Map<String, String> context) {
        return context.get(variableName);
    }
}
