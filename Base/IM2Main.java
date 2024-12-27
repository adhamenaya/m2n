package Base;

import Form.M2FormElement;
import Observer.M2ObserversEngine;

public interface IM2Main {

    M2ObserversEngine m2ObserversEngine = M2ObserversEngine.getInstance();

    void init();

}
