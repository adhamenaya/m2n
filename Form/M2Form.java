package Form;
import Attributes.M2Attributes;
import Base.M2Base;

import java.util.ArrayList;
import java.util.List;

public class M2Form extends M2Base {
    private List<M2FormElement> elements;
    private M2Attributes attributes;

    private IM2FormElementViewMode mode;

    public M2Form(){
        elements = new ArrayList<M2FormElement>();
    }

    public List<M2FormElement> getElements() {
        return elements;
    }

    public void setMode(IM2FormElementViewMode mode) {
        this.mode = mode;
    }
}