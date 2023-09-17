package ua.com.yehorchevardin.java.patterns.structural.flyweight;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;
import ua.com.yehorchevardin.java.patterns.structural.flyweight.dto.ProjectRunner;

public class FlyweightPattern implements PatternExplanation {
  @Override
  public void execute() {
    ProjectRunner projectRunner = new ProjectRunner();
    projectRunner.run();
  }
}
