package Validation;

import Base.M2Base;
import ErrorHandling.Exceptions.InvalidM2ObjectException;
import Form.M2FormElement;
import Prototype.IM2Prototype;

public class M2DynamicValidation extends M2Validation {
    public M2DynamicValidation() {
        super();
    }

    /**
     * @return
     * @throws InvalidM2ObjectException
     */
    @Override
    public M2Base getInstance() throws InvalidM2ObjectException {
        return null;
    }

    /**
     * @return
     */
    @Override
    public IM2Prototype clone() {
        return null;
    }

    @Override
    public boolean validate(M2FormElement dataElement) {
        // custom validation logic
        return false;
    }
}
