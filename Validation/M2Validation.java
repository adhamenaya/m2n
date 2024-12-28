package Validation;

import Base.M2Base;
import Form.M2FormElement;

public abstract class M2Validation extends M2Base {
    public M2Validation() {
    }

    public abstract boolean validate(M2FormElement dataElement);
}
