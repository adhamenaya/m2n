package RulesEngine;

import Form.M2FormElement;
import Observer.IM2Observer;

import java.util.List;

public class M2RulesManager implements IM2Observer {
    private static M2RulesManager instance;

    private M2RulesManager() {
        // private constructor
    }

    public static M2RulesManager getInstance() {
        if (instance == null) {
            instance = new M2RulesManager();
        }
        return instance;
    }

    // methods for managing rules
    public void evaluateRules(List<M2FormElement> elements) {
        // logic to evaluate
    }

    @Override
    public void update(String message) {
    }
}
