package Lifecycle;

import Base.M2Base;

import java.util.ArrayList;
import java.util.List;

public class M2LifecycleManager extends M2Base implements IM2LifecycleManager {
    List<M2Phase> phases;
    public M2LifecycleManager() {
        phases = new ArrayList<M2Phase>();
    }

    @Override
    public M2Status getCurrentStatus() {
        return null;
    }
}
