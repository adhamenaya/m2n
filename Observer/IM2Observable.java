package Observer;

import Base.M2Base;
import Base.M2LegacyName;

@M2LegacyName(ids = {"InstrumentEvent"})
public interface IM2Observable {
    void notifyObservers(M2Base m2Base, String message, int importance, boolean isCritical);

    void attach(M2Base m2Base, IM2Observer observer);

    void detach(M2Base m2Base, IM2Observer observer);
}
