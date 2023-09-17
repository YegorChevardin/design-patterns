package ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.banking;

import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.ProjectManager;

public class BankingProjectManager implements ProjectManager {
  @Override
  public void manageProject() {
    System.out.println("Manages baking project");
  }
}
