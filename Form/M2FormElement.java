package Form;

import Attributes.M2Attributes;
import Base.M2Base;
import Base.M2Main;
import Observer.M2Observer;
import Observer.M2ObserversEngine;
import Observer.M2Subject;

import java.util.List;

public abstract class M2FormElement extends M2Base implements IM2FormElementEvents, M2Subject {

    private List<M2FormElement> childrenElements;
    private List<M2Attributes> attributes;
    protected M2Main main;

    private List<M2Observer> observers = M2ObserversEngine.getObservers();

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
    public boolean update(Object value) {
        return false;
    }

    @Override
    public boolean validate() {
        return false;
    }

    @Override
    public void render() {
        renderLabel();
        renderElement();
        renderChildren();
        renderValidationMessages();
    }

    protected abstract String getLabel();
    protected abstract void renderElement();

    protected void renderLabel(){
        System.out.println(getLabel());
    }
    protected void renderChildren(){}
    protected void renderValidationMessages() {
        // ... render any validation messages
    }
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isValid() {
        return false;
    }

    protected void setMediator(M2Main main) {
        this.main = main;
    }

    @Override
    public void attach(M2Observer observer) {

    }

    @Override
    public void detach(M2Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}