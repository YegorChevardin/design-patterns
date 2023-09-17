package ua.com.yehorchevardin.java.patterns.structural.adapter;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;

public class AdapterPattern implements PatternExplanation {
  @Override
  public void execute() {
    new DatabaseRunner().run();
  }
}
