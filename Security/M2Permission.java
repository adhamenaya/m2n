package Security;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class M2Permission {

    public static List<M2PermissionOptions> getReadonlyPermissionOptions() {
        return Collections.singletonList(M2PermissionOptions.READ);
    }

    public static List<M2PermissionOptions> getAllPermissionOptions() {
        return Arrays.asList(M2PermissionOptions.values());  // Returns a list of all enum values
    }

    public static List<M2PermissionOptions> getWritePermissionOptions() {
        return Collections.singletonList(M2PermissionOptions.WRITE);
    }

    public static List<M2PermissionOptions> getDeletePermissionOptions() {
        return Collections.singletonList(M2PermissionOptions.DELETE);
    }

    public static List<M2PermissionOptions> getUpdatePermissionOptions() {
        return Collections.singletonList(M2PermissionOptions.UPDATE);
    }
}
