package Form;

import Attributes.M2Attributes;
import Base.M2Base;
import Base.M2Main;
import Observer.IM2Observable;
import Observer.IM2Observer;
import Observer.M2ObserversManager;
import RemoteFunctions.M2EmailFunction;
import RemoteFunctions.M2LoggerFunction;

import java.util.List;

public abstract class M2FormElement extends M2Base implements IM2FormElementEvents, IM2Observable {

    protected M2Main main;
    private List<M2FormElement> childrenElements;
    private List<M2Attributes> attributes;
    private List<IM2Observer> observers = M2ObserversManager.getObservers();

    public M2FormElement() {
        this.attach(this, new M2EmailFunction());
        this.attach(this, new M2LoggerFunction());
    }

    @Override
    public boolean save() {
        notifyObservers(this, "Element saved");
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

    protected String getLabel() {
        return "";
    }

    protected abstract void renderElement();

    protected void renderLabel() {
        System.out.println(getLabel());
    }

    protected void renderChildren() {
    }

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

    protected void setMain(M2Main main) {
        this.main = main;
    }

    @Override
    public void attach(M2Base m2Base, IM2Observer observer) {
        main.m2ObserversManager.addObserver(m2Base, observer);
    }

    @Override
    public void detach(M2Base m2Base, IM2Observer observer) {
        main.m2ObserversManager.removeObserver(m2Base, observer);
    }

    @Override
    public void notifyObservers(M2Base m2Base, String message) {
        main.m2ObserversManager.notifyObservers(m2Base, message);
    }
}