package ua.com.yehorchevardin.java.patterns.behavioral.observer.dto.impl;

import ua.com.yehorchevardin.java.patterns.behavioral.observer.dto.Observed;
import ua.com.yehorchevardin.java.patterns.behavioral.observer.dto.Observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed {
  List<String> vacancies = new ArrayList<>();

  List<Observer> subscribers = new ArrayList<>();

  public void addVacancy(String vacancy) {
    vacancies.add(vacancy);
    notifyAllObservers();
  }

  public void removeVacancy(String vacancy) {
    vacancies.remove(vacancy);
    notifyAllObservers();
  }

  @Override
  public void addObserver(Observer observer) {
    subscribers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    subscribers.remove(observer);
  }

  private void notifyAllObservers() {
    for (Observer subscriber : subscribers) {
      subscriber.handleEvent(vacancies);
    }
  }

  @Override
  public void notifyObservers() {
    notifyAllObservers();
  }
}
