package Base;

import ErrorHandling.M2ErrorManager;
import Form.M2Form;
import Form.M2FormElement;
import Form.M2FormManager;
import Lifecycle.M2LifecycleManager;
import Locale.M2LocaleManager;
import Logging.M2LoggingManager;
import Observer.M2ObserversManager;
import RemoteFunctions.M2EmailFunction;
import RulesEngine.M2RulesManager;
import Security.M2SecurityManager;
import Validation.M2ValidationManager;
import Versioning.M2VersionManager;

/**
 * Main class for managing the application lifecycle, components, and global managers.
 * <p>
 * This class serves as the central hub that initializes various managers, connects form elements with
 * observers, and facilitates the execution of business logic for an associated {@link M2Form}.
 * </p>
 */
public class M2Main implements IM2Main {

    /**
     * Singleton instance of the Rules Manager.
     */
    public static M2RulesManager m2RulesManager = M2RulesManager.getInstance();

    /**
     * Singleton instance of the Validation Manager.
     */
    public static M2ValidationManager m2ValidationManager = M2ValidationManager.getInstance();

    /**
     * Singleton instance of the Observers Manager.
     */
    public static M2ObserversManager m2ObserversManager = M2ObserversManager.getInstance();

    /**
     * Singleton instance of the Locale Manager.
     */
    public static M2LocaleManager m2LocaleManager = M2LocaleManager.getInstance();

    /**
     * Singleton instance of the Version Manager.
     */
    public static M2VersionManager m2VersionManager = M2VersionManager.getInstance();

    /**
     * Singleton instance of the Security Manager.
     */
    public static M2SecurityManager m2SecurityManager = M2SecurityManager.getInstance();

    /**
     * Singleton instance of the Logging Manager.
     */
    public static M2LoggingManager m2LoggingManager = M2LoggingManager.getInstance();

    /**
     * Singleton instance of the Error Manager.
     */
    public static M2ErrorManager m2ErrorManager = M2ErrorManager.getInstance();

    /**
     * Singleton instance of the Lifecycle Manager.
     */
    public static M2LifecycleManager m2LifecycleManager = M2LifecycleManager.getInstance();

    /**
     * Singleton instance of the Form Manager.
     */
    public static M2FormManager m2FormManager = M2FormManager.getInstance();

    /**
     * The form object associated with this main instance.
     */
    private M2Form form;

    /**
     * Constructor that initializes the main application with a specific form.
     *
     * @param form The {@link M2Form} to be associated with this instance of {@link M2Main}.
     */
    public M2Main(M2Form form) {
        this.form = form;
        init();
    }

    /**
     * Initializes the application by setting this main instance in the form
     * and attaching observers to the form elements.
     */
    @Override
    public void init() {
        this.form.setMain(this);
        attachObservers();
    }

    /**
     * Attaches observers to all elements of the associated form.
     * <p>
     * Each form element is subscribed using its own instance and linked to an {@link M2EmailFunction}.
     * </p>
     */
    public void attachObservers() {
        for (M2FormElement formElement : form.getElements()) {
            formElement.attach(formElement, new M2EmailFunction());
        }
    }
}