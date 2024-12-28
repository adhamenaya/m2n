package Lifecycle;

import Base.M2Base;

import java.util.List;
import java.util.Map;

public class M2LifecycleManager {
    private static M2LifecycleManager instance;
    private static Map<M2Base, List<M2Base>> m2BaseRolesMap;

    private M2LifecycleManager() {
    }

    public static M2LifecycleManager getInstance() {
        if (instance == null) {
            instance = new M2LifecycleManager();
        }
        return instance;
    }


    public static M2Phase getCurrentPhase() {
        return new M2Phase();
    }
}
