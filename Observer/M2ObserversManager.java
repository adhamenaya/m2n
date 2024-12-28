package Observer;

import Base.M2Base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class M2ObserversManager {
    private static List<IM2Observer> observers;
    private static M2ObserversManager instance;
    private static Map<M2Base, List<IM2Observer>> m2BaseObserversMap;

    private M2ObserversManager() {
    }

    public static M2ObserversManager getInstance() {
        if (instance == null) {
            instance = new M2ObserversManager();
            observers = new ArrayList<>();
            m2BaseObserversMap = new HashMap<M2Base, List<IM2Observer>>();
        }
        return instance;
    }

    public static List<IM2Observer> getObservers() {
        if (observers == null) {
            observers = new ArrayList<>();
        }
        return observers;
    }

    public static List<IM2Observer> getObservers(M2Base m2Base) {
        if (m2BaseObserversMap != null) {
            if (m2BaseObserversMap.containsKey(m2Base)) {
                return m2BaseObserversMap.get(m2Base);
            }
        }
        return null;
    }

    public void addObserver(M2Base m2Base, IM2Observer observer) {
        this.m2BaseObserversMap.get(m2Base).add(observer);
    }

    public void removeObserver(M2Base m2Base, IM2Observer observer) {
        this.m2BaseObserversMap.get(m2Base).remove(observer);
    }

    public void notifyObservers(M2Base m2Base, String message) {
        for (IM2Observer observer : m2BaseObserversMap.get(m2Base)) {
            observer.update(message);
        }
    }
}
