package Form.ElementType;

import Form.M2FormElement;

public class M2Textbox extends M2FormElement {

    @Override
    public boolean update(Object value){
        String text = (String) value;
        if(super.main != null){
            super.main.notify(this, "valueChanged");
        }
        return false;
    }
}
