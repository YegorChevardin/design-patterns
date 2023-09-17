package ua.com.yehorchevardin.java.patterns.behavioral.chainofresponsibility;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;
import ua.com.yehorchevardin.java.patterns.behavioral.chainofresponsibility.dto.BugTracker;

public class ChainOfResponsibilityPattern implements PatternExplanation {
  @Override
  public void execute() {
    BugTracker bugTracker = new BugTracker();

    bugTracker.tack();
  }
}
