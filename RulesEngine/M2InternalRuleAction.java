package RulesEngine;

import Base.M2Base;
import DataSource.IM2InternalDataSourceManager;
import ErrorHandling.Exceptions.InvalidM2ObjectException;
import Prototype.IM2Prototype;

public class M2InternalRuleAction extends M2Base implements IM2InternalDataSourceManager {
    public M2InternalRuleAction() {
    }

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
