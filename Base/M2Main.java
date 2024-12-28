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

public class M2Main implements IM2Main {
    public static M2RulesManager m2RulesManager = M2RulesManager.getInstance();
    public static M2ValidationManager m2ValidationManager = M2ValidationManager.getInstance();
    public static M2ObserversManager m2ObserversManager = M2ObserversManager.getInstance();
    public static M2LocaleManager m2LocaleManager = M2LocaleManager.getInstance();
    public static M2VersionManager m2VersionManager = M2VersionManager.getInstance();
    public static M2SecurityManager m2SecurityManager = M2SecurityManager.getInstance();
    public static M2LoggingManager m2LoggingManager = M2LoggingManager.getInstance();
    public static M2ErrorManager m2ErrorManager = M2ErrorManager.getInstance();
    public static M2LifecycleManager m2LifecycleManager = M2LifecycleManager.getInstance();
    public static M2FormManager m2FormManager = M2FormManager.getInstance();

    private M2Form form;

    public M2Main(M2Form form) {
        this.form = form;
        init();
    }

    @Override
    public void init() {
        this.form.setMain(this);
        attachObservers();
    }

    // subscribe all form elements to observer
    public void attachObservers(){
        for (M2FormElement formElement : form.getElements()) {
            formElement.attach(formElement, new M2EmailFunction());
        }
    }
}

