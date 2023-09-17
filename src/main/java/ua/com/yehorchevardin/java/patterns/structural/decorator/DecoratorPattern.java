package ua.com.yehorchevardin.java.patterns.structural.decorator;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;
import ua.com.yehorchevardin.java.patterns.structural.decorator.dto.Task;

public class DecoratorPattern implements PatternExplanation {
  @Override
  public void execute() {
    Task task = new Task();

    task.execute();
  }
}
