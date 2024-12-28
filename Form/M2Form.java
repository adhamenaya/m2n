package Form;
import Attributes.M2Attributes;
import Base.M2Base;
import Base.M2Main;
import ErrorHandling.Exceptions.InvalidM2ObjectException;
import Prototype.IM2Prototype;

import java.util.ArrayList;
import java.util.List;

public class M2Form extends M2Base {
    private List<M2FormElement> elements;
    private M2Attributes attributes;
    private M2Main main;

    private IM2FormElementViewMode mode;

    public M2Form(){
        elements = new ArrayList<M2FormElement>();
    }

    @Override
    public M2Base getInstance() throws InvalidM2ObjectException {
        return null;
    }

    @Override
    public IM2Prototype clone() {
        return null;
    }

    public List<M2FormElement> getElements() {
        return elements;
    }

    public void setMain(M2Main main) {
        this.main = main;
        for (M2FormElement element : elements) {
            element.setMain(main);
        }
    }

    public void setMode(IM2FormElementViewMode mode) {
        this.mode = mode;
    }
}