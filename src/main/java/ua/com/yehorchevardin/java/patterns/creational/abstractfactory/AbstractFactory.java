package ua.com.yehorchevardin.java.patterns.creational.abstractfactory;

import ua.com.yehorchevardin.java.patterns.PatternExplanation;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.projects.Project;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.projects.impl.BankProject;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.projects.impl.ShopWebsite;

public class AbstractFactory implements PatternExplanation {
  @Override
  public void execute() {
    System.out.println("Writing project");
    Project project = new ShopWebsite();
    project.createProject();
    Project project1 = new BankProject();
    project1.createProject();
    System.out.println("Finished writing project");
  }
}
