package RulesEngine.Expressions;

import javax.naming.Context;
import java.util.Map;

public interface IM2Expression {
    boolean interpret(Map<String, String> context);
    Object getValue(Map<String, String> context);
}
