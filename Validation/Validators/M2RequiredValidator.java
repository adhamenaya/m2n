package Validation.Validators;

import Form.ElementType.IM2FormElementManager;
import Form.M2FormElement;

import javax.xml.validation.Validator;

public class M2RequiredValidator extends M2FomElementValidator {
    public M2RequiredValidator(M2FormElement component) {
        super(component);
    }

    public boolean validate(M2FormElement component) {
        return super.validate() && !component.isEmpty();
    }

    @Override
    public boolean isValid() {
        return !component.isEmpty();
    }
}
