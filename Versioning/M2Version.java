package Versioning;

import Base.M2Base;
import ErrorHandling.Exceptions.InvalidM2ObjectException;
import Prototype.IM2Prototype;

public class M2Version extends M2Base {

    private long version;
    private String versionName;
    private long sequenceNumber;

    @Override
    public M2Base getInstance() throws InvalidM2ObjectException {
        return null;
    }

    @Override
    public IM2Prototype clone() {
        return null;
    }
}
