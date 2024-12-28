package RulesEngine;

import Base.M2Base;
import ErrorHandling.Exceptions.InvalidM2ObjectException;
import Prototype.IM2Prototype;

import java.util.List;

public class M2RuleEvents extends M2Base implements IM2RulesEngineManager {
    private List<M2Rule> rules;
    public M2RuleEvents() {}

    /**
     * @return
     * @throws InvalidM2ObjectException
     */
    @Override
    public M2Base getInstance() throws InvalidM2ObjectException {
        return null;
    }

    /**
     * @return
     */
    @Override
    public IM2Prototype clone() {
        return null;
    }

    @Override
    public void evaluateRules() {

    }
}
