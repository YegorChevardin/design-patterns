package ua.com.yehorchevardin.java.patterns.creational.singleton.singletons.impl;

import ua.com.yehorchevardin.java.patterns.creational.singleton.singletons.Logger;

public class ThreadsafeSingletonLogger implements Logger {
  private static ThreadsafeSingletonLogger instance;

  private ThreadsafeSingletonLogger() {}

  public static ThreadsafeSingletonLogger getInstance() {
    if (instance == null) {
      synchronized (ThreadsafeSingletonLogger.class) {
        if (instance == null) {
          try {
            Thread.sleep(2000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          instance = new ThreadsafeSingletonLogger();
        }
      }
    }
    return instance;
  }

  @Override
  public void logEvent(String message) {
    System.out.println(message);
  }
}
