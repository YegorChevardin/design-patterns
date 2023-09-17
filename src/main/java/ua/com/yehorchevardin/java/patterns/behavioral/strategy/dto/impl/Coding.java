package ua.com.yehorchevardin.java.patterns.behavioral.strategy.dto.impl;

import ua.com.yehorchevardin.java.patterns.behavioral.strategy.dto.Activity;

public class Coding implements Activity {
  @Override
  public void justDoIt() {
    System.out.println("Writting code...");
  }
}
