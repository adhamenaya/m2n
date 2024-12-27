package Validation.Validators;

import Form.M2FormElement;

public class M2RequiredValidator extends M2FomElementValidator {
    public M2RequiredValidator(M2FormElement component) {
        super(component);
    }

    public boolean validate(M2FormElement component) {
        return super.validate() && !component.isEmpty();
    }

}
