package Lifecycle.FormPhases;

import Base.M2Base;
import Lifecycle.IM2LifecycleHandler;

public class M2FormInProgressPhase implements IM2LifecycleHandler {
    @Override
    public void handle(M2Base form, IM2LifecycleHandler nextPhase) {
        // ...logic to handle in progress form

        if (nextPhase != null) {
            nextPhase.handle(form, nextPhase);
        }
    }
}
