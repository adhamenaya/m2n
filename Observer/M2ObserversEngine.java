package Observer;

import java.util.ArrayList;
import java.util.List;

public class M2ObserversEngine {
    private static List<M2Observer> observers;

    private M2ObserversEngine() {
        observers = new ArrayList<M2Observer>();
    }

    public static List<M2Observer> getObservers() {
        if (observers == null) {
            new M2ObserversEngine();
        }
        return observers;
    }
}
