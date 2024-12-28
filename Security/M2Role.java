package Security;


import Base.M2Base;
import ErrorHandling.Exceptions.InvalidM2ObjectException;
import Prototype.IM2Prototype;

import java.util.List;
import java.util.Map;

public class M2Role extends M2Base {
    private static Map<M2Base, List<M2PermissionOptions>> m2BasePermissionsMap;
    private String description;

    public M2Role(String description) {
        this.description = description;
    }

    /**
     * @return
     * @throws InvalidM2ObjectException
     */
    @Override
    public M2Base getInstance() throws InvalidM2ObjectException {
        return null;
    }

    /**
     * @return
     */
    @Override
    public IM2Prototype clone() {
        return null;
    }
}
