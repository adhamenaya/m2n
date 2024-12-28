package ErrorHandling;

import java.util.logging.ErrorManager;

public class M2ErrorManager {
    private static M2ErrorManager instance;
    private M2ErrorManager() {
        instance = new M2ErrorManager();
    }

    public static M2ErrorManager getInstance() {
        if (instance == null) {
            instance = new M2ErrorManager();
        }
        return instance;
    }
}
