package Observer;

public interface M2Subject {
    void attach(IM2Observer observer);
    void detach(IM2Observer observer);
    void notifyObservers();
}
