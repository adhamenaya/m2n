package Security;

import Base.M2Base;

import java.util.List;
import java.util.Map;

public class M2SecurityManager {
    private static M2SecurityManager instance;
    private static List<M2Role> m2Roles;
    private static Map<M2Base, List<M2Role>> m2BaseRolesMap;

    private M2SecurityManager(){}

    public static M2SecurityManager getInstance() {
        if (instance == null) {
            instance = new M2SecurityManager();
        }
        return instance;
    }

    public static List<M2Role> getRoles() {
        return m2Roles;
    }
    public static List<M2Role> getRoles(M2Base base) {
        if(m2BaseRolesMap != null) {
            if(m2BaseRolesMap.containsKey(base)) {
                return m2BaseRolesMap.get(base);
            }
        }
        return null;
    }

    public static M2User getCurrentUser() {
        return new M2User();
    }
}
