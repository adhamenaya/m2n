package DataSource;

import Base.M2Base;
import ErrorHandling.Exceptions.InvalidM2ObjectException;
import Prototype.IM2Prototype;

public class M2DataSource extends M2Base {
    @Override
    public M2Base getInstance() throws InvalidM2ObjectException {
        return null;
    }

    @Override
    public IM2Prototype clone() {
        return null;
    }
}
