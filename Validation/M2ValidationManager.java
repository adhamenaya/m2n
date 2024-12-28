package Validation;

public class M2ValidationManager {
    private static M2ValidationManager instance;
    private M2ValidationManager() {
        // private constructor
    }
    public static M2ValidationManager getInstance() {
        if (instance == null) {
            instance = new M2ValidationManager();
        }
        return instance;
    }

    // ... methods for managing validations
}
