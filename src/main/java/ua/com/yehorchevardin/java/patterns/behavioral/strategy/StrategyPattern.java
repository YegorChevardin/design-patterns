package ua.com.yehorchevardin.java.patterns.behavioral.strategy;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;
import ua.com.yehorchevardin.java.patterns.behavioral.strategy.dto.Developer;
import ua.com.yehorchevardin.java.patterns.behavioral.strategy.dto.impl.Reading;
import ua.com.yehorchevardin.java.patterns.behavioral.strategy.dto.impl.Sleeping;

public class StrategyPattern implements PatternExplanation {
  @Override
  public void execute() {
    Developer developer = new Developer(new Sleeping());

    developer.executeActivity();
    developer.setActivity(new Reading());

    developer.executeActivity();
  }
}
