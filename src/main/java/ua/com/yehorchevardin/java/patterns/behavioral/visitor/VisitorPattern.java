package ua.com.yehorchevardin.java.patterns.behavioral.visitor;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;

public class VisitorPattern implements PatternExplanation {
  @Override
  public void execute() {
    Project project = new Project();
    Developer jun = new JuniorDeveloper();
    Developer sin = new SeniorDeveloper();

    System.out.println("Junior in action");
    project.beWritten(jun);
    System.out.println("Senior in action");
    project.beWritten(sin);
  }
}
