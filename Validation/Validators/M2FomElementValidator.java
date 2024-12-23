package Validation.Validators;

import Form.ElementType.IM2FormElementManager;
import Form.M2FormElement;
import Validation.IM2ValidationChain;

abstract class M2FomElementValidator implements IM2FormElementManager, IM2ValidationChain {
    protected M2FormElement component;
    private IM2ValidationChain next;

    public M2FomElementValidator(M2FormElement component) {
        this.component = component;
    }

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
        if(this.isValid()){
            if(next!=null){
                return next.validate();
            }
            return true;
        }
        return false;
    }

    @Override
    public void render() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void setNext(IM2ValidationChain next) {
        this.next = next;
    }
}
