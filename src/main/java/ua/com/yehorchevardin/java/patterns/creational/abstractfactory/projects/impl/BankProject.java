package ua.com.yehorchevardin.java.patterns.creational.abstractfactory.projects.impl;

import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.abstractfactories.ProjectAbstractFactory;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.abstractfactories.impl.BankingProjectTeamFactory;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.Developer;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.ProjectManager;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.dto.Tester;
import ua.com.yehorchevardin.java.patterns.creational.abstractfactory.projects.Project;

public class BankProject implements Project {
  @Override
  public void createProject() {
    ProjectAbstractFactory websiteProjectTeamFactory = new BankingProjectTeamFactory();

    Developer developer = websiteProjectTeamFactory.receiveDeveloper();
    Tester tester = websiteProjectTeamFactory.reveiveTester();
    ProjectManager projectManager = websiteProjectTeamFactory.receiveProjectManager();

    developer.writeCode();
    tester.testProject();
    projectManager.manageProject();
  }
}
