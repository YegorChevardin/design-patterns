package ua.com.yehorchevardin.java.patterns.behavioral.strategy.dto.impl;

import ua.com.yehorchevardin.java.patterns.behavioral.strategy.dto.Activity;

public class Reading implements Activity {
  @Override
  public void justDoIt() {
    System.out.println("I am reading...");
  }
}
