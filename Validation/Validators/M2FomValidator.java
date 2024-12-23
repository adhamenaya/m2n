package Validation.Validators;

import Form.IM2FormManager;

import javax.xml.validation.Validator;

public class M2FomValidator implements IM2FormManager{
    @Override
    public boolean save() {
        return false;
    }

    @Override
    public boolean load() {
        return false;
    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public boolean update() {
        return false;
    }

    @Override
    public boolean validate() {
        return false;
    }
}
