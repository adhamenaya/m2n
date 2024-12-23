package Base;

import Locale.M2Locale;
import Prototype.IM2Prototype;
import Security.M2Permission;
import Versioning.M2Version;

public class M2Base implements IM2Prototype {

    M2Version version;
    M2Locale locale;
    M2Permission permission;

    public M2Base() {}

    @Override
    public IM2Prototype clone() {
        M2Base clone = new M2Base();
        // complete the logic and return
        return clone;
    }
}
