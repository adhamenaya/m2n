package RulesEngine;

import Base.M2Base;
import ErrorHandling.Exceptions.InvalidM2ObjectException;
import Prototype.IM2Prototype;

public class M2Condition extends M2Base {
    public M2Condition() {}

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
