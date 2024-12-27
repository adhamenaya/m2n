package Validation.Validators;

import Form.IM2FormElementEvents;
import Form.M2FormElement;
import Validation.IM2ValidationChain;

abstract class M2FomElementValidator implements IM2ValidationChain {
    protected M2FormElement component;
    private IM2ValidationChain next;

    public M2FomElementValidator(M2FormElement component) {
        this.component = component;
    }

    private boolean isValid(){
        return component.isValid();
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
    public void setNext(IM2ValidationChain next) {
        this.next = next;
    }
}
