package Validation;

import Form.M2FormElement;

public class M2DynamicValidation extends M2Validation {
    public M2DynamicValidation() {
        super();
    }

    @Override
    public boolean validate(M2FormElement dataElement) {
        // custom validation logic
        return false;
    }
}
