package RulesEngine;

import Form.M2FormElement;
import Observer.IM2Observer;
import Observer.M2Subject;

import java.util.List;

public class M2RulesEngine implements IM2Observer {
    private static M2RulesEngine instance;

    private M2RulesEngine(){
        // private constructor
    }

    public static M2RulesEngine getInstance(){
        if(instance == null){
            instance = new M2RulesEngine();
        }
        return instance;
    }

    // methods for managing rules
    public void evaluateRules(List<M2FormElement> elements){
        // logic to evaluate
    }

    @Override
    public void update(String message) {
    }
}
