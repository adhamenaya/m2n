package Security;


import Base.M2Base;

import java.util.List;
import java.util.Map;

public class M2Role extends M2Base {
    private static Map<M2Base, List<M2PermissionOptions>> m2BasePermissionsMap;
    private String description;

    public M2Role(String description) {
        this.description = description;
    }
}
