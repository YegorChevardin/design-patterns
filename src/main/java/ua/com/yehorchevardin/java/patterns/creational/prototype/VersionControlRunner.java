package ua.com.yehorchevardin.java.patterns.creational.prototype;

import ua.com.yehorchevardin.java.patterns.creational.prototype.dto.Project;
import ua.com.yehorchevardin.java.patterns.creational.prototype.dto.ProjectFactory;

public class VersionControlRunner {
  public void execute() {
    Project project = new Project("CoolProject", 1, "java");
    System.out.println(project);
    ProjectFactory projectFactory = new ProjectFactory(project);
    Project clone = projectFactory.cloneProject();
    System.out.println(clone);
  }
}
