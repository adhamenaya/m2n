package Lifecycle;

import Base.M2Base;
import ErrorHandling.Exceptions.InvalidM2ObjectException;
import Prototype.IM2Prototype;

public class M2Phase extends M2Base {

    private M2Status status;
    private boolean active;

    @Override
    public M2Base getInstance() throws InvalidM2ObjectException {
        if (isValid())
            return this;
        else throw new InvalidM2ObjectException();
    }

    @Override
    public IM2Prototype clone() {
        return null;
    }

    public void setStatus(M2Status status) {
        this.status = status;
    }

    public boolean isValid() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
