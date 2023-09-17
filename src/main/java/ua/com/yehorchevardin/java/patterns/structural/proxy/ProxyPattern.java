package ua.com.yehorchevardin.java.patterns.structural.proxy;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;
import ua.com.yehorchevardin.java.patterns.structural.proxy.dto.ProjectRunner;

public class ProxyPattern implements PatternExplanation {
  @Override
  public void execute() {
    ProjectRunner projectRunner = new ProjectRunner();
    projectRunner.run();
  }
}
