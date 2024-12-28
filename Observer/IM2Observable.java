package Observer;

import Base.M2Base;

public interface IM2Observable {
    void notifyObservers(M2Base m2Base, String message);

    void attach(M2Base m2Base, IM2Observer observer);

    void detach(M2Base m2Base, IM2Observer observer);
}
