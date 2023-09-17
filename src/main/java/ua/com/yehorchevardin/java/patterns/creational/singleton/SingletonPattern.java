package ua.com.yehorchevardin.java.patterns.creational.singleton;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;
import ua.com.yehorchevardin.java.patterns.creational.singleton.singletons.Logger;
import ua.com.yehorchevardin.java.patterns.creational.singleton.singletons.impl.SingletonLogger;

public class SingletonPattern implements PatternExplanation {
  @Override
  public void execute() {
    Logger logger = SingletonLogger.getInstance();

    System.out.println(logger);
    logger.logEvent("Hello world! from logger");

    Logger logger1 = SingletonLogger.getInstance();
    System.out.println(logger1);
    logger1.logEvent("Hello world from another but same logger!");
  }
}
