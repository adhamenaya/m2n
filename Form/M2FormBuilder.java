package Form;

import Attributes.M2Attributes;
import RulesEngine.M2Rule;
import Validation.M2Validation;

import java.util.List;

public class M2FormBuilder {
    private M2Form m2Form;

    public M2FormBuilder() {
        m2Form = new M2Form();
    }

    public M2FormBuilder setAttributes(List<M2Attributes> attributes) {
        // logic to set attributes
        return this;
    }

    public M2FormBuilder setRules(List<M2Rule> rules){
        // logic to set rules
        return this;
    }

    public M2FormBuilder setValidations(List<M2Validation> validations){
        // logic to set validations
        return this;
    }

    public M2Form build(){
        return m2Form;
    }
}
