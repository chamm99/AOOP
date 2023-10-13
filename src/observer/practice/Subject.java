package observer.practice;

public interface Subject {
    public void addObserver(Observer o);
    public void romoveObserver(Observer o);
    public void notifyObserver(Object o);
}
