package RulesEngine;

import ErrorHandling.Exceptions.InvalidM2ObjectException;
import Form.M2FormElement;
import Base.M2Base;
import Prototype.IM2Prototype;

import java.util.List;

public class M2RuleTarget extends M2Base {
    List<M2FormElement> formElements;
    public M2RuleTarget() {}

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
}
