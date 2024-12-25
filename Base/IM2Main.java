package Base;

import Form.M2FormElement;

public interface IM2Main {
    boolean init();
    void notify(M2FormElement sender, String event);
}
