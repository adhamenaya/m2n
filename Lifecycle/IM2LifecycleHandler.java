package Lifecycle;

import Base.M2Base;

public interface IM2LifecycleHandler {
    void handle(M2Base form, IM2LifecycleHandler nextPhase);
}
