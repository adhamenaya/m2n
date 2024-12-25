package Base;

import Form.M2Form;
import Form.M2FormElement;
import RemoteFunctions.M2RemoteFunctionsEngine;
import RulesEngine.M2RulesEngine;
import Validation.M2Validation;
import Validation.M2ValidationEngine;

public class M2Main implements IM2Main {
    protected M2RulesEngine rulesEngine = M2RulesEngine.getInstance();
    protected M2ValidationEngine validationEngine = M2ValidationEngine.getInstance();
    protected M2RemoteFunctionsEngine remoteFunctionsEngine = M2RemoteFunctionsEngine.getInstance();

    private M2Form form;

    public M2Main(M2Form form) {
        this.form = form;
    }

    @Override
    public boolean init() {
        return false;
    }

    @Override
    public void notify(M2FormElement sender, String event) {
        if (event.equals("valueChanged")) {
            rulesEngine.evaluateRules(form.getElements());
        }
    }
}
