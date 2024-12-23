package Form;
import Validation.M2ValidationManager;
import Base.M2Base;

import java.util.ArrayList;
import java.util.List;

public class M2Form extends M2Base {
    private List<M2FormElement> elements;
    private M2ValidationManager validationManager;

    public M2Form(){
        elements = new ArrayList<M2FormElement>();
    }

}