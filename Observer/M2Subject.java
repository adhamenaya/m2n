package Observer;

public interface M2Subject {
    void attach(M2Observer observer);
    void detach(M2Observer observer);
    void notifyObservers();
}
