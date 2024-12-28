package Form;

public class M2FormManager {
    private static M2FormManager instance = null;
    private static M2FormBuilder m2FormBuilderInstance = null;
    private static M2FormPresenter m2FormPresenterInstance = null;
    private static M2LegacyFormParser m2LegacyFormParserInstance = null;

    private M2FormManager() {
        instance = new M2FormManager();
    }

    public static M2FormManager getInstance() {
        if (instance == null) {
            instance = new M2FormManager();
        }
        return instance;
    }

    public M2FormBuilder getM2FormBuilderInstance() {
        if (m2FormBuilderInstance == null) {
            m2FormBuilderInstance = new M2FormBuilder();
        }
        return m2FormBuilderInstance;
    }

    public M2FormPresenter getM2FormPresenterInstance() {
        if (m2FormPresenterInstance == null) {
            m2FormPresenterInstance = new M2FormPresenter();
        }
        return m2FormPresenterInstance;
    }

    public M2LegacyFormParser getM2LegacyFormParserInstance() {
        if (m2LegacyFormParserInstance == null) {
            m2LegacyFormParserInstance = new M2LegacyFormParser();
        }
        return m2LegacyFormParserInstance;
    }

}
