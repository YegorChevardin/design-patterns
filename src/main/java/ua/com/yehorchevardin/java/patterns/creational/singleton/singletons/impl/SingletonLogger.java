package ua.com.yehorchevardin.java.patterns.creational.singleton.singletons.impl;

import ua.com.yehorchevardin.java.patterns.creational.singleton.singletons.Logger;

public class SingletonLogger implements Logger {
  private static SingletonLogger instance;

  private SingletonLogger() {}

  public static SingletonLogger getInstance() {
    if (instance == null) {
      instance = new SingletonLogger();
    }
    return instance;
  }

  @Override
  public void logEvent(String message) {
    System.out.println(message);
  }
}
