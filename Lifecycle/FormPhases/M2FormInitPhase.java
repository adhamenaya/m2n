package Lifecycle.FormPhases;

import Base.M2Base;
import Lifecycle.IM2LifecycleHandler;
import Lifecycle.M2Phase;

public class M2FormInitPhase implements IM2LifecycleHandler {
    @Override
    public void handle(M2Base form, IM2LifecycleHandler nextPhase) {
        // ...logic to handle init the form

        if(nextPhase != null) {
            nextPhase.handle(form, nextPhase);
        }
    }
}
