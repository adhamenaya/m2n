package Validation;

public class M2ValidationEngine {
    private static M2ValidationEngine instance;

    private M2ValidationEngine() {
        // private constructor
    }

    public static M2ValidationEngine getInstance() {
        if (instance == null) {
            instance = new M2ValidationEngine();
        }
        return instance;
    }

    // ... methods for managing validations
}
