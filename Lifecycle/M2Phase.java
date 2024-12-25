package Lifecycle;

import Base.M2Base;

public class M2Phase extends M2Base {
    public M2Status getStatus() {
        return status;
    }

    public void setStatus(M2Status status) {
        this.status = status;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    private M2Status status;
    private boolean active;
}
