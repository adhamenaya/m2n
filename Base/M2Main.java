package Base;

import Form.M2Form;
import Form.M2FormElement;
import Observer.M2ObserversEngine;
import RemoteFunctions.M2EmailFunction;
import RulesEngine.M2RulesEngine;
import Validation.M2ValidationEngine;

public class M2Main implements IM2Main {
    public static M2RulesEngine rulesEngine = M2RulesEngine.getInstance();
    public static M2ValidationEngine validationEngine = M2ValidationEngine.getInstance();
    public static M2ObserversEngine observersEngine = M2ObserversEngine.getInstance();

    private M2Form form;

    public M2Main(M2Form form) {
        this.form = form;
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

