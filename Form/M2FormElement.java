package Form;

import Base.M2Base;
import Form.ElementType.IM2FormElementManager;

import java.util.List;

public class M2FormElement extends M2Base implements IM2FormElementManager {
    private List<M2FormElement> childrenElements;
    public M2FormElement(){}

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

    @Override
    public void render() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}