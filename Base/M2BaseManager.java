package Base;

import Lifecycle.IM2LifecycleManager;
import Logging.IM2LoggingManager;
import Security.IM2SecurityManager;
import Versioning.IM2VersionManager;

public class M2BaseManager {
    protected IM2LoggingManager loggingManager;
    protected IM2VersionManager versionManager;
    protected IM2LifecycleManager lifecycleManager;
    protected IM2SecurityManager securityManager;
}
