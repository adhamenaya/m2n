package Observer;

import Base.M2Base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class M2ObserversEngine {
    private static List<IM2Observer> observers;
    private static M2ObserversEngine instance;
    private static Map<M2Base, List<IM2Observer>> m2ObserversEngineMap;

    private M2ObserversEngine(){}

    public static M2ObserversEngine getInstance() {
        if (instance == null) {
            instance = new M2ObserversEngine();
            observers = new ArrayList<>();
            m2ObserversEngineMap = new HashMap<M2Base, List<IM2Observer>>();
        }
        return instance;
    }

    public static List<IM2Observer> getObservers() {
        if (observers == null) {
            observers = new ArrayList<>();
        }
        return observers;
    }

    public static Map<M2Base, List<IM2Observer>> getM2ObserversEngineMap() {
        if (m2ObserversEngineMap == null) {
            m2ObserversEngineMap = new HashMap<>();
        }
        return m2ObserversEngineMap;
    }

    public void addObserver(M2Base m2Base, IM2Observer observer) {
        this.m2ObserversEngineMap.get(m2Base).add(observer);
    }
    public void removeObserver(M2Base m2Base, IM2Observer observer) {
        this.m2ObserversEngineMap.get(m2Base).remove(observer);
    }
    public void notifyObservers(M2Base m2Base, String message){
        for (IM2Observer observer : observers) {
            observer.update(message);
        }
    }
}
