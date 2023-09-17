package ua.com.yehorchevardin.java.patterns.behavioral.observer.dto;

public interface Observed {
  void addObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObservers();
}
