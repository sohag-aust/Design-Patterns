package observable;

import observers.Observer;

// Observable is also known as Subject
public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
