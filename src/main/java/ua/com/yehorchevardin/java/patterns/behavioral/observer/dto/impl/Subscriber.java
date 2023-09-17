package ua.com.yehorchevardin.java.patterns.behavioral.observer.dto.impl;

import ua.com.yehorchevardin.java.patterns.behavioral.observer.dto.Observer;

import java.util.List;

public class Subscriber implements Observer {
  private String name;

  public Subscriber(String name) {
    this.name = name;
  }

  @Override
  public void handleEvent(List<String> vacancies) {
    System.out.println("Changes in vacancies:");
    for (String v : vacancies) {
      System.out.println(v);
    }
  }
}
