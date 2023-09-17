package ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.website;

import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.ProjectManager;

public class WebsiteProjectManager implements ProjectManager {
  @Override
  public void manageProject() {
    System.out.println("Manages project on PHP!");
  }
}
